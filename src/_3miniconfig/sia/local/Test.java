package _3miniconfig.sia.local;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _2wiringbean.sia.local.Performer;

public class Test {
	//autowire byName
	//@org.junit.Test
	public void testAutowireByName() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext_3miniconfig.xml");
		Performer performer = (Performer)context.getBean("instrumentalist_wtf2");
		performer.perform();
	}
	//autowire byType
	//@org.junit.Test
	public void testAutowireByType() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext_3miniconfig.xml");
		Performer performer = (Performer)context.getBean("instrumentalist_wtf3");
		performer.perform();
	}
	
	//autowire byType
	@org.junit.Test
	public void testAutowireConstrator() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext_3miniconfig.xml");
		Performer performer = (Performer)context.getBean("poeticJuggler");
		performer.perform();
	}
}
