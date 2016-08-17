package local.sia._3miniconfig;

import org.springframework.beans.factory.annotation.Value;

import local.sia._2wiringbean.Instrument;

public class BeanForInjectInstrument2 implements Instrument{

	@Value("#{'BeanForInjectInstrument2'}")
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	@Override
	public void play() {
		System.out.println(this.name + " BeanForInjectInstrument2 is playing...." );	
	}

}
