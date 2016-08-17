package local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice;

public class Volunteer implements Thinker {

	private String thoughts;
	
	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
		
	}

	public String getThoughts() {
		return this.thoughts;
	}
	@Override
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	@Override
	public void sayMyThoughts() {
		System.out.println(this.thoughts);
		
	}

	
	
}
