package test.springinaction.local;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.springinaction.local.HelloSpring;

public class TestSayHello {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring)context.getBean("hellospring");
		helloSpring.sayHello();
		System.out.println(java.lang.Math.PI);
	}
	
	@Test
	public void testPi() {
		System.out.println(java.lang.Math.PI);
	}
}