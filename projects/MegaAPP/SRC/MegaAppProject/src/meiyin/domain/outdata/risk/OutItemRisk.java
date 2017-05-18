package meiyin.domain.outdata.risk;

import com.fasterxml.jackson.annotation.JsonInclude;

public class OutItemRisk {

	private String name;
	private String pic_id;
	private String level;
	private String voice_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic_id() {
		return pic_id;
	}
	public void setPic_id(String pic_id) {
		this.pic_id = pic_id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getVoice_id() {
		return voice_id;
	}
	public void setVoice_id(String voice_id) {
		this.voice_id = voice_id;
	}
	
	
	
}
