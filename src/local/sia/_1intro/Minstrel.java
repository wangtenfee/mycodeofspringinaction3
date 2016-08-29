package local.sia._1intro;


public class Minstrel {
	
	private String curClazzName;
	public Minstrel(){
		this.curClazzName = this.getClass().getName()+".";
	}
	
	public void singBeforeQuest() {
		System.out.println(curClazzName+Thread.currentThread().getStackTrace()[1].getMethodName());
		
	}
	
	public void singAfterQuest() {
		System.out.println(curClazzName+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
