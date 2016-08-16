package _3miniconfig.sia.local;

import javax.inject.Inject;
import javax.inject.Named;

import _2wiringbean.sia.local.Instrument;
import _2wiringbean.sia.local.Performer;

public class BeanForInject implements Performer{
	
	@Inject
	@Named("beanForInjectInstrument")
	private Instrument instrument;

	@Override
	public void perform() {
		this.instrument.play();
	}
	
	
	
}
