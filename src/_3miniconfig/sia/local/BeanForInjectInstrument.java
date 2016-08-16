package _3miniconfig.sia.local;

import org.springframework.beans.factory.annotation.Value;

import _2wiringbean.sia.local.Instrument;

public class BeanForInjectInstrument implements Instrument{

	@Value("#{beanForInjectInstrument2.name}")
	private String name;
	
	
	
//	public void setName(String name) {
//		this.name = name;
//	}



	@Override
	public void play() {
		System.out.println(name + "  BeanForInjectInstrument is playing..");
		
	}
	
}
