package anno;

public class Student {

	@ValidateField(isMandatory = true, lengthSize = 10, getRegex = RegexEnum.START_WITH_CAP_LATTER, getMessage = MessageEnum.StartWithCapLatterMessage)
	private String firstName;
	
	@ValidateField(isMandatory = false, lengthSize = 10, getRegex = RegexEnum.START_WITH_CAP_LATTER, getMessage = MessageEnum.StartWithCapLatterMessage)
	private String lastName;
	
	@ValidateField(isMandatory = true, lengthSize = 10, getRegex = RegexEnum.MOBILE_NO, getMessage = MessageEnum.InvalidMobileNoMessage)
	private String mobileNo;
	
	@ValidateField(isMandatory = false, lengthSize = 30, getRegex = RegexEnum.EMAIL, getMessage = MessageEnum.InvalidEmailMessage)
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String firstName, String lastName, String mobileNo, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	
}
