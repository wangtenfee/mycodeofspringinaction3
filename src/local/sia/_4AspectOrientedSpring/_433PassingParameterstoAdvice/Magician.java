package local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice;

public class Magician implements MindReader{

	private String thoughts;
	
	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
