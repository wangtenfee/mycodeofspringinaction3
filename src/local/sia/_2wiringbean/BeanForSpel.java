package local.sia._2wiringbean;

public class BeanForSpel implements Performer{

	private int count;
	private String messgage;
	private float frequency;
	private float capacity;
	private String name;
	private boolean enabled;
	private Instrument instrument;
	private String song;
	
	
	public void setCount(int count) {
		this.count = count;
	}

	public void setMessgage(String messgage) {
		this.messgage = messgage;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("BeanForSpel:");
		System.out.println("this.count:"+this.count);
		System.out.println("this.messgage:"+this.messgage);
		System.out.println("this.frequency:"+this.frequency);
		System.out.println("this.capacity:"+this.capacity);
		System.out.println("this.name:"+this.name);
		System.out.println("this.enabled:"+this.enabled);
		System.out.println("this.song:"+this.song);
		this.instrument.play();
	}

}
