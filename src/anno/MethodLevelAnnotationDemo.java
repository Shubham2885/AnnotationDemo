package anno;

//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
int value();  
}  

public class MethodLevelAnnotationDemo {
	
	@MyAnnotation(value=10)  
	public void sayHello(){System.out.println("hello annotation"); 
	}  
	  
	public static void main(String args[])throws Exception{  
	 
	MethodLevelAnnotationDemo h=new MethodLevelAnnotationDemo();  
	Method m=h.getClass().getMethod("sayHello");  
	
	MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
	System.out.println("value is: "+manno.value());  
	
	}
}
