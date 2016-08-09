package _2wiringbean.sia.local;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@org.junit.Test
	public void testPerformer() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		//Performer performer = (Performer)context.getBean("juggler"); 
		Performer performer = (Performer)context.getBean("poeticJuggler");
		performer.perform();
	}
	

}
