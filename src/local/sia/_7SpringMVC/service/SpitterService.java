package local.sia._7SpringMVC.service;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.dao.inter.SpitterDao;

@Service
public class SpitterService {
	
	@Inject
	@Named("spitterDaoJdbcImpl")
	private SpitterDao spitterDaoJdbc;
	
	@Inject
	@Named("spitterDaoRedisImpl")
	private SpitterDao spitterDaoRedisImpl;	

	public Set<Spittle> getRecentSpittles(int num) {
		
		return null;
	}
	
	public Spitter getSpitterByName(String username) {
		return spitterDaoJdbc.getSpitterByUsername(username); 
	}
	
	public void saveSpitter(Spitter spitter){
		spitterDaoJdbc.addSpitter(spitter);
	}
}
