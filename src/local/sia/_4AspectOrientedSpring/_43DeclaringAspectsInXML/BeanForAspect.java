package local.sia._4AspectOrientedSpring._43DeclaringAspectsInXML;



import local.sia._2wiringbean.Instrument;
import local.sia._2wiringbean.Performer;

public class BeanForAspect implements Performer{

	private Instrument instrument;
	
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		this.instrument.play();
		
	}

}
