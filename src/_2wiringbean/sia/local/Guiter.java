package _2wiringbean.sia.local;

public class Guiter implements Instrument{

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("excuting Instrument.play()"+this.name+" is playing....");		
	}

}
