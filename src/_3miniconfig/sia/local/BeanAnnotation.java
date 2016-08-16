package _3miniconfig.sia.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import _2wiringbean.sia.local.Instrument;
import _2wiringbean.sia.local.Performer;

public class BeanAnnotation implements Performer{

	@Autowired(required=false)
	@Qualifier("beanAnnotationInstrumentx")
	private Instrument instrument;
		
	@Override
	public void perform() {
		this.instrument.play();
	}

}
