package _3miniconfig.sia.local;

import _2wiringbean.sia.local.Instrument;

public class BeanForAnnotationOfInstrument implements Instrument{

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		
		System.out.println(this.name+" BeanForAnnotationOfInstrument is playing....");
	}

}
