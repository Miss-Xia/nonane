package meiyin.domain.outdata;

public class InSessionPhone {
	private Long InSessionTime;
	private String message;
	private Integer expires_in = 2590200;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}

	public Long getInSessionTime() {
		return InSessionTime;
	}

	public void setInSessionTime(Long inSessionTime) {
		InSessionTime = inSessionTime;
	}
	
}
