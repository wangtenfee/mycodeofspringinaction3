package local.sia._2wiringbean;

public class PoeticJuggler extends Juggler{

	private Poem poem;
	private int beanBags = 3;
	
	@Override
	public void perform() {
		super.perform();   
		poem.recite();
	}

	public PoeticJuggler() {
		super();
	}
	
	public PoeticJuggler(int beanBags,Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	
	
}
