package local.sia._4AspectOrientedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import local.sia._2wiringbean.Performer;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Magician;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.MindReader;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Thinker;
import local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Volunteer;

public class Test {
	
	//@org.junit.Test
	public void testXmlAspect() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-4AspectOrientedSpring.xml");
		Performer performer = (Performer)context.getBean("beanForAspect");
		performer.perform();
	}

	@org.junit.Test
	public void magicianShouldReadVolunteersMind() {
//		Volunteer volunteer = new Volunteer();
//		Magician magician = new Magician();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-4AspectOrientedSpring.xml");
		MindReader mindReader = (MindReader)context.getBean("magician");
		Thinker thinker  = (Thinker)context.getBean("volunteer");
		//thinker.thinkOfSomething("Queen of Hearts");
		thinker.setThoughts("wtf");//这里必须明确调用execution(* local.sia._4AspectOrientedSpring._433PassingParameterstoAdvice.Thinker.setThoughts(String))中使用的方法setThoughts才可以，不能用注入的方式
		//thinker.sayMyThoughts();
		//Assert("Queen of Hearts", magician.getThoughts());
		System.out.println(mindReader.getThoughts());
	}
	
}
