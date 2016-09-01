package local.sia._7SpringMVC.domain;

import org.springframework.stereotype.Repository;

@Repository
public class Spittle {
	
	private int spitter_id;
	private String spittleText;
	
	public int getSpitter_id() {
		return spitter_id;
	}
	public void setSpitter_id(int spitter_id) {
		this.spitter_id = spitter_id;
	}
	public String getSpittleText() {
		return spittleText;
	}
	public void setSpittleText(String spittleText) {
		this.spittleText = spittleText;
	}
	
}
