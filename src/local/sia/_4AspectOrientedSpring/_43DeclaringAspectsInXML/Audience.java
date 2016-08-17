package local.sia._4AspectOrientedSpring._43DeclaringAspectsInXML;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void takeSeats(){
		System.out.println("audience is taking their seats...");
	}
	
	public void turnOffCellPhones(){
		System.out.println("audience is turning off their phone...");
	}
	
	public void applaud(){
		System.out.println("audience is applauding...CLAP CLAP CLAP CLAP CLAP ");
	}
	
	public void demandRefund(){
		System.out.println("Boo! We want our money back!");
	}
	
	//4.3.2 Declaring around advice,这个不好啊。。用个<aop:arount/>还得写个方法。弱鸡。。
	public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
		
		try {
			takeSeats();
			turnOffCellPhones();
			long start = System.currentTimeMillis();
			proceedingJoinPoint.proceed();
			long end = System.currentTimeMillis();
			applaud();
			System.out.println("the proformace last: "+(end - start));
		} catch (Throwable e) {
			demandRefund();
		}
	}
	
}
