package local.sia._3miniconfig;

import org.springframework.beans.factory.annotation.Autowired;

import local.sia._2wiringbean.Instrument;
import local.sia._2wiringbean.Performer;

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
