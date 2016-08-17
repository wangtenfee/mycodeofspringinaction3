package local.sia._3miniconfig;



import local.sia._2wiringbean.Instrument;

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
