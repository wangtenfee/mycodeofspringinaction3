package local.sia._7SpringMVC.dao.redisimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.inter.SpitterDao;

@Repository("spitterDaoRedisImpl")
public class SpitterDaoRedisImpl implements SpitterDao{

	@Override
	public void addSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spitter getSpitterById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spitter getSpitterByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spitter> findAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
