package local.sia._3miniconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import local.sia._2wiringbean.Instrument;

@Component
public class BeanForComponentInstrument implements Instrument{

	@Value("#{'BeanForComponentInstrument'}")
	private String name;
	
	@Override
	public void play() {
		System.out.println(this.name + "  is playing ...");
		
	}

}
