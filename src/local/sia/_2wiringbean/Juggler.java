package local.sia._2wiringbean;

public class Juggler implements Performer{

	private String curClazzName;
	private int beanBags = 3;
	
	public Juggler(){
		this.curClazzName = this.getClass().getName()+".";
	}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	
	@Override
	public void perform() {
		System.out.println(curClazzName+Thread.currentThread().getStackTrace()[1].getMethodName()+"_beanBags: "+this.beanBags);
	}

}
