package local.sia._7SpringMVC.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations={"file:WebContent/WEB-INF/spitter-servlet.xml"})
public class BasicTest extends AbstractTransactionalJUnit4SpringContextTests {

}
