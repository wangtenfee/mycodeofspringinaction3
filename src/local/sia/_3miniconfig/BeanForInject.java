package local.sia._3miniconfig;

import javax.inject.Inject;
import javax.inject.Named;

import local.sia._2wiringbean.Instrument;
import local.sia._2wiringbean.Performer;

public class BeanForInject implements Performer{
	
	@Inject
	@Named("beanForInjectInstrument")
	private Instrument instrument;

	@Override
	public void perform() {
		this.instrument.play();
	}
	
	
	
}
