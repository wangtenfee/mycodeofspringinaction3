package local.sia._7SpringMVC.dao;

import java.util.List;

import local.sia._7SpringMVC.domain.Spitter;
import local.sia._7SpringMVC.domain.Spittle;

public interface SpitterDao {
	  void addSpitter(Spitter spitter);

	  void saveSpitter(Spitter spitter);

	  Spitter getSpitterById(long id);

	  List<Spittle> getRecentSpittle();
	  
	  void saveSpittle(Spittle spittle);
	  
	  List<Spittle> getSpittlesForSpitter(Spitter spitter);

	  Spitter getSpitterByUsername(String username);
	  
	  void deleteSpittle(long id);
	  
	  Spittle getSpittleById(long id);
	  
	  List<Spitter> findAllSpitters();
	}
