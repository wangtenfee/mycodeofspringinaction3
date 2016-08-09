package test.springinaction.local;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _1intro.sia.local.BraveKnight;
import _1intro.sia.local.Knight;
import _1intro.sia.local.Quest;
import _1intro.sia.local.QuestException;

public class TestBraveKnight {
	public static void main(String[] args) throws QuestException {
		Quest mockQuest = mock(Quest.class);
		BraveKnight braveKnight = new BraveKnight(mockQuest);
		braveKnight.embarkonQuest();
		System.out.println(55);
	}
	
	@Test
	public void testInjectKnight() throws QuestException{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
		Knight knight = (Knight)context.getBean("braveKnight");
		//Knight knight = (Knight)context.getBean("braveKnightWithMinstrel");
		knight.embarkonQuest();
	}
}
