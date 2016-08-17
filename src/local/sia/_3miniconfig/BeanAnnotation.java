package local.sia._3miniconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import local.sia._2wiringbean.Instrument;
import local.sia._2wiringbean.Performer;

public class BeanAnnotation implements Performer{

	@Autowired(required=false)
	@Qualifier("beanAnnotationInstrumentx")
	private Instrument instrument;
		
	@Override
	public void perform() {
		this.instrument.play();
	}

}
