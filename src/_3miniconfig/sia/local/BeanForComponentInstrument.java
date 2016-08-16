package _3miniconfig.sia.local;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import _2wiringbean.sia.local.Instrument;

@Component
public class BeanForComponentInstrument implements Instrument{

	@Value("#{'BeanForComponentInstrument'}")
	private String name;
	
	@Override
	public void play() {
		System.out.println(this.name + "  is playing ...");
		
	}

}
