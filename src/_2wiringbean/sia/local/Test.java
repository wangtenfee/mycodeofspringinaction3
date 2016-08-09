package _2wiringbean.sia.local;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	//@org.junit.Test
	public void testPerformer() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		//Performer performer = (Performer)context.getBean("juggler"); 
		Performer performer = (Performer)context.getBean("poeticJuggler");
		performer.perform();
	}
	
	
	//test bean scope
	//@org.junit.Test
	public void testBeanScope() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		//Performer performer = (Performer)context.getBean("juggler"); 
		BeanSingleton beanSingleton1 = (BeanSingleton)context.getBean("beanSingleton");
		BeanSingleton beanSingleton2 = (BeanSingleton)context.getBean("beanSingleton");
		BeanPrototype beanPrototype1 = (BeanPrototype)context.getBean("beanPrototype");
		BeanPrototype beanPrototype2 = (BeanPrototype)context.getBean("beanPrototype");
		
		System.out.println(beanSingleton1);
		System.out.println(beanSingleton2);
		System.out.println(beanPrototype1);
		System.out.println(beanPrototype2);		
	}
	
	//test init-method && destory-method
	//@org.junit.Test
	public void testInitAndDestory() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		for(int i=0;i<1;i++){
			Auditorium auditorium = (Auditorium)context.getBean("auditorium"); 
		}
		System.gc();
	}

	//<!-- 2.2 Injecting into bean properties -->
	@org.junit.Test
	public void testInstrumentalist() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		Instrumentalist instrumentalist = (Instrumentalist)context.getBean("instrumentalist_wtf");
		instrumentalist.perform();

	}
}
