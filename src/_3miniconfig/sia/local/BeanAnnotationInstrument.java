package _3miniconfig.sia.local;



import _2wiringbean.sia.local.Instrument;

public class BeanAnnotationInstrument implements Instrument{

	private String name;
	
	@Override
	public void play() {
		System.out.println(this.name + "  BeanAnnotationInstrument is playing.....");
		
	}

	public void setName(String name) {
		this.name = name;
	}

}
