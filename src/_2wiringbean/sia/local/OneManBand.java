package _2wiringbean.sia.local;

import java.util.Collection;

public class OneManBand implements Performer{

	
	private Collection<Instrument> instruments;
		
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		System.out.println("OneManBand.perform()");
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

}
