package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateField {

	boolean isMandatory() default false;
	int lengthSize() default 5;
	RegexEnum getRegex();
	MessageEnum getMessage();
}
