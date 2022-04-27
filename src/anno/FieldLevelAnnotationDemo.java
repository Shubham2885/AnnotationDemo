package anno;

public class FieldLevelAnnotationDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Student student = new Student("Shubham", "Chavan", "9729347239", "shubham@gmail.com");
		Validator.validateField(student);
		System.out.println("OK");
	}
}
