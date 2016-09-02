package local.sia._7SpringMVC.dao.domain;

import java.util.Date;




public class Spittle {
	
	private long id;
	private long spitter_id;
	private String spittleText;
	private boolean isDelete;
	private Date postedTime;
	
	public Date getPostedTime() {
		return postedTime;
	}
	public void setPostedTime(Date postedTime) {
		this.postedTime = postedTime;
	}
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSpitter_id() {
		return spitter_id;
	}
	public void setSpitter_id(long spitter_id) {
		this.spitter_id = spitter_id;
	}
	public String getSpittleText() {
		return spittleText;
	}
	public void setSpittleText(String spittleText) {
		this.spittleText = spittleText;
	}
	
}
