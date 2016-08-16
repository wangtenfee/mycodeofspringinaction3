package _3miniconfig.sia.local;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import _2wiringbean.sia.local.Instrument;
import _2wiringbean.sia.local.Performer;

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
