package _2wiringbean.sia.local;

public class Stage {
	
	//lazyload
	private static class StageSingletonHolder{ 
		private static Stage instance = new Stage();
	}
	
	private Stage(){}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
}
