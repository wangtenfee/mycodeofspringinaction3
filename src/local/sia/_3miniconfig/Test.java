package local.sia._3miniconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import local.sia._2wiringbean.Performer;

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
	//@org.junit.Test
	public void testAutowireConstrator() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext_3miniconfig.xml");
		Performer performer = (Performer)context.getBean("poeticJuggler");
		performer.perform();
	}
	//annotation autowire
	//@org.junit.Test
	public void testAnnotationWired() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-321annotationnew.xml");
		Performer performer = (Performer)context.getBean("beanAnnotation");
		performer.perform();
	}	
	
	//annotation inject
	//@org.junit.Test
	public void testInject() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-321annotationnew.xml");
		Performer performer = (Performer)context.getBean("beanForInject");
		performer.perform();
	}		
	
	//annotation inject
	@org.junit.Test
	public void testComponent() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext-33AutomaticallyDiscoveringBeans.xml");
		Performer performer = (Performer)context.getBean("beanForComponent");
		performer.perform();
	}
}
