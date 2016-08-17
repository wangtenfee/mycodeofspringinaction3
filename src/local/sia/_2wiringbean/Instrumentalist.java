package local.sia._2wiringbean;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
		
	public Instrumentalist() {
	}

	
	@Override
	public void perform() {
		System.out.println("excuting Instrumentalist.perform()");
		System.out.println("Playing " + song + " : ");
		instrument.play();	
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}



}
