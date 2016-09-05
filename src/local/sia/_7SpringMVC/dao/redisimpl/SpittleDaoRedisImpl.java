package local.sia._7SpringMVC.dao.redisimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.dao.inter.SpittleDao;

@Repository("spittleDaoRedisImpl")
public class SpittleDaoRedisImpl implements SpittleDao{

	@Override
	public void deleteSpittle(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spittle> getRecentSpittle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Spittle> getSpittlesByOwnid(long ownid) {
		// TODO Auto-generated method stub
		return null;
	}

}
