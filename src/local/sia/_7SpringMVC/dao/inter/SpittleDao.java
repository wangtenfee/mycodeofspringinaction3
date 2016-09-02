package local.sia._7SpringMVC.dao.inter;

import java.util.List;


import local.sia._7SpringMVC.dao.domain.Spittle;

public interface SpittleDao {
	  void deleteSpittle(long id);
	  
	  Spittle getSpittleById(long id);
	  
	  List<Spittle> getRecentSpittle();
	  
	  void saveSpittle(Spittle spittle);
	  
	  List<Spittle> getSpittlesByOwnid(long ownid);
}
