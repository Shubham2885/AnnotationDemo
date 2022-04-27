package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

class A {
	
	public void showMyFullNameWithAddressDetails() {
		System.out.println("showMyFullNameWithAddressDetails -- Parent method..");
	}
	
	@Deprecated
	public void show() {
		//statement
	}
}

class B extends A {
	
	@Deprecated
	
	public void showMyFullNameWithAddressDetails() {
		System.out.println("showMyFullNamewithAddressDetails--Overrided Method");
	}
	
	
}

class X {
	public void print() {
		System.out.println("Parent method...");
	}
}

class Y extends X {
	public void print() {
		System.out.println("Chield method...");
	}
}

//Marker Annotatio
//@interface LaptopInfo {
//	
//}

//Single Value Annotation
//@interface LaptopInfo {
//	String os() default "Linux";
//}

//Multi Value Annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface LaptopInfo {
	String os() default "Linux";
	int osVersioin() default 1;
}

@LaptopInfo(os="MicroSoff", osVersioin = 11)
class Laptop {

	String model;
	int coreVersion;
	
	public Laptop(String model, int coreVersion) {
		super();
		this.model = model;
		this.coreVersion = coreVersion;
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", coreVersion=" + coreVersion + "]";
	}
	
	
}

public class ClassLevelAnnotationDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		A a = new B();
		a.showMyFullNameWithAddressDetails();
		a.show();
		X x = new Y();
		
		x.print();
		
		Laptop laptop = new Laptop("G50", 3);
		
		Student student = new Student("Shubham", "Chavan", "9729347239", "shubham@gmail.com");
		
		Class c = laptop.getClass();
		Class studentClass = student.getClass();
		Field[] fieldsOfStudent = studentClass.getDeclaredFields();
		
		for(Field f : fieldsOfStudent) {
			System.out.println(f.getName());
			System.out.println(f.get(f));
		}
		
		LaptopInfo myAnnotation = (LaptopInfo) c.getAnnotation(LaptopInfo.class);
		
		Field[] fields = c.getDeclaredFields();
		
		String fieldName = fields[0].getName();
		System.out.println("Field 1 in Laptop class = "+fields[0].getName());
		
		if("model".equals(fieldName)) {
			String value = laptop.model;
		}
		
		System.out.println(laptop);
		System.out.println(myAnnotation.os());
		System.out.println(myAnnotation.osVersioin());
	}
}
