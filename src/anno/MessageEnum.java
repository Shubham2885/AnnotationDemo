package anno;

public enum MessageEnum {
	StartWithCapLatterMessage("this field should be start with Cap latter"),
	InvalidMobileNoMessage("Invalid Mobile Number"),
	InvalidEmailMessage("Invalid Email"),
	LengthExceedMessage("");
	
	private String constant;
	
	MessageEnum(String constant) {
		this.constant = constant;
	}
	
	public String getCode() {
		return constant;
	}
}
