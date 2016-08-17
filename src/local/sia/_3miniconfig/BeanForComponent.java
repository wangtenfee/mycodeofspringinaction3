package local.sia._3miniconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import local.sia._2wiringbean.Instrument;
import local.sia._2wiringbean.Performer;

@Component
public class BeanForComponent implements Performer{

	@Autowired
	@Qualifier("beanForComponentInstrument")
	private Instrument instrument;
	
	@Override
	public void perform() {
		this.instrument.play();
	}
	
}
