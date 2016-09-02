package local.sia._7SpringMVC.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.inter.SpitterDao;

@ContextConfiguration(locations={"file:WebContent/WEB-INF/spitter-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)  
public class SpitterDaoTest{
	
	@Autowired
	private SpitterDao spitterDaoJTimpl;

	@Test
	public void addSpitter() {
		Spitter spitter2 = new Spitter();
		spitter2.setEmail("teest");
		spitter2.setFullname("test");
		spitter2.setPassword("wtf");
		spitter2.setUpdate_by_email(true);
		spitter2.setUsername("wtf");
		spitterDaoJTimpl.addSpitter(spitter2);
	}

	public void saveSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		
	}

	public Spitter getSpitterById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spitter getSpitterByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Spitter> findAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
