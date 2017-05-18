package meiyin.domain.outdata;

public class OutAdvice {
	private String custom;
	private String advice;
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((advice == null) ? 0 : advice.hashCode());
		result = prime * result + ((custom == null) ? 0 : custom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutAdvice other = (OutAdvice) obj;
		if (advice == null) {
			if (other.advice != null)
				return false;
		} else if (!advice.equals(other.advice))
			return false;
		if (custom == null) {
			if (other.custom != null)
				return false;
		} else if (!custom.equals(other.custom))
			return false;
		return true;
	}

	
	
}
