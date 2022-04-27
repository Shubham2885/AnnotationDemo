package anno;

public enum RegexEnum {

	START_WITH_CAP_LATTER("^[A-Z].*"),
	MOBILE_NO("^{1}[6-9]+[0-9]{9}"),
	EMAIL("");
	
	private String constant;
	
	RegexEnum(String constant) {
		this.constant = constant;
	}
	
	public String getCode() {
		return constant;
	}
}
