package local.sia._4AspectOrientedSpring._43DeclaringAspectsInXML;

import local.sia._2wiringbean.Instrument;

public class BeanForAspectInstrument implements Instrument{

	@Override
	public void play() {
		System.out.println("BeanForAspectInstrument is playing....");
	}

}
