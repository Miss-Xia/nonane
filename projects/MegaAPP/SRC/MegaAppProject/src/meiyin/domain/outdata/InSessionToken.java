package meiyin.domain.outdata;

public class InSessionToken extends OutAccessToken{
	private Long InSessionTime;
	private Integer accountId;
	public Long getInSessionTime() {
		return InSessionTime;
	}

	public void setInSessionTime(Long inSessionTime) {
		InSessionTime = inSessionTime;
	}



	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	
}
