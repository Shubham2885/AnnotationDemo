package anno;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static void validateField(Student student) throws IllegalArgumentException, IllegalAccessException {
		
		@SuppressWarnings("rawtypes")
		Class class1 =  student.getClass();
		Field[] fields = class1.getDeclaredFields();
		
		for(Field field : fields) {
			ValidateField validateField = field.getAnnotation(ValidateField.class);
			field.setAccessible(true);
			validateField(field.getName(), field.get(student), validateField);
		}
	}
	
	private static void validateField(String fieldName, Object data, ValidateField validateField) {
		String str = (String) data;
		if(validateField.isMandatory() && str == null ) {
			throw new CustomException.LengthExceedException(" This Field = "+fieldName+" is mandatory");
		}
		if(validateField.isMandatory() && str.length() > validateField.lengthSize()) {
			throw new CustomException.LengthExceedException("Field = "+fieldName+" actual length is "+str.length()+" but expected less than "+validateField.lengthSize());
		}
		
		if(validateField.isMandatory()) {
			Pattern pattern = Pattern.compile(validateField.getRegex().getCode());
			Matcher matcher = pattern.matcher(str);
			if(!matcher.find()) {
				throw new CustomException.LengthExceedException(fieldName+" "+validateField.getMessage().getCode());
			}
		}
	}
	
}
