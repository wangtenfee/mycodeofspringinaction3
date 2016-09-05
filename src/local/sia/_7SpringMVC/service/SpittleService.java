package local.sia._7SpringMVC.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;
import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.dao.inter.SpittleDao;

@Service
public class SpittleService {
	
	@Inject
	@Named("spittleDaoJdbcImpl")
	private SpittleDao spittleDaoJdbc;
	
	@Inject
	@Named("spittleDaoRedisImpl")
	private SpittleDao spittleDaoRedis;
	
	public List<Spittle> getSpittlesBySpitter(Spitter spitter) {	
		return spittleDaoJdbc.getSpittlesByOwnid(spitter.getId());
	}
}
