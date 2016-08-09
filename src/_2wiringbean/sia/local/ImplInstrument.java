package _2wiringbean.sia.local;

public class ImplInstrument implements Instrument{

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("ImplInstrument:"+this.name+"is playing....");		
	}

}
