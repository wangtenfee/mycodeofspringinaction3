package _3miniconfig.sia.local;

import org.springframework.beans.factory.annotation.Autowired;

import _2wiringbean.sia.local.Instrument;
import _2wiringbean.sia.local.Performer;

public class BeanForAnnotation implements Performer{

	//@Autowired
	private Instrument instrument;
	
	@Autowired
	public BeanForAnnotation(Instrument instrument) {
		this.instrument=instrument;
	}
//	public BeanForAnnotation() {
//		
//	}
//	public void setInstrument(Instrument instrument) {
//		this.instrument = instrument;
//	}


	@Override
	public void perform() {
		
		this.instrument.play();
		
	}

}
