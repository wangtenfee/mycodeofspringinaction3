package local.sia._4AspectOrientedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import local.sia._2wiringbean.Performer;

public class Test {
	
	@org.junit.Test
	public void testXmlAspect() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-4AspectOrientedSpring.xml");
		Performer performer = (Performer)context.getBean("beanForAspect");
		performer.perform();
	}
}
