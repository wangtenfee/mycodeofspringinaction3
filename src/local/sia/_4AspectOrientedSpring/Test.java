package local.sia._4AspectOrientedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import local.sia._2wiringbean.Performer;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Magician;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Volunteer;

public class Test {
	
	@org.junit.Test
	public void testXmlAspect() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-4AspectOrientedSpring.xml");
		Performer performer = (Performer)context.getBean("beanForAspect");
		performer.perform();
	}

	@org.junit.Test
	public void magicianShouldReadVolunteersMind() {
		Volunteer volunteer = new Volunteer();
		Magician magician = new Magician();
		volunteer.thinkOfSomething("Queen of Hearts");
		//Assert("Queen of Hearts", magician.getThoughts());
		System.out.println(magician.getThoughts());
	}
	
}
