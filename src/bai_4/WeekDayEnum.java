package bai_4;

public enum WeekDayEnum {
//	MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
	MALE("m","male"), FEMALE("f","female");
	
	private String code;
	private String text;
	
	private WeekDayEnum(String code, String text) {
		this.code = code;
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Code of " + text + " is " + code;
	}
	
}
