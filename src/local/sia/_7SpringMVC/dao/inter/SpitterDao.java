package local.sia._7SpringMVC.dao.inter;

import java.util.List;


import local.sia._7SpringMVC.dao.domain.Spitter;


public interface SpitterDao {
	  void addSpitter(Spitter spitter);

	  void saveSpitter(Spitter spitter);

	  Spitter getSpitterById(long id);

	  Spitter getSpitterByUsername(String username);
	  
	  List<Spitter> findAllSpitters();
	}
