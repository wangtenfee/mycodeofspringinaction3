package local.sia._7SpringMVC.dao.jtimple;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.inter.SpitterDao;

@Repository
public class SpitterDaoJTimpl implements SpitterDao{

	private static final String SQL_INSERT_SPITTER = "insert into t_spitter (username, password, fullname, email, update_by_email) values (?, ?, ?, ?, ?)";

	private static final String SQL_UPDATE_SPITTER = "update t_spitter set username = ?, password = ?, fullname = ?, set email=?"
			+ "where id = ?";

	private static final String SQL_SELECT_SPITTER = "" + "select id, username, password, fullname from t_spitter";

	private static final String SQL_SELECT_SPITTER_BY_ID = SQL_SELECT_SPITTER + " where id=?";
	
	private static final String SQL_SELECT_SPITTER_BY_USERNAME = SQL_SELECT_SPITTER + " where username=?";

	@Inject
	private JdbcTemplate jdbcTemplate;
		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addSpitter(Spitter spitter) {
		jdbcTemplate.update(SQL_INSERT_SPITTER,
				spitter.getUsername(),
				spitter.getPassword(),
				spitter.getFullname(),
				spitter.getEmail(),
				spitter.isUpdate_by_email());
	}

	@Override
	public void saveSpitter(Spitter spitter) {
	    jdbcTemplate.update(SQL_UPDATE_SPITTER,
	            spitter.getUsername(), 
	            spitter.getPassword(),
	            spitter.getFullname(), 
	            spitter.getEmail(),
	            spitter.getId());		
	}

	@Override
	public Spitter getSpitterById(long id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_SPITTER_BY_ID, new Object[]{id},new BeanPropertyRowMapper<Spitter>(Spitter.class));
	}


	@Override
	public Spitter getSpitterByUsername(String username) {
		return jdbcTemplate.queryForObject(SQL_SELECT_SPITTER_BY_USERNAME, new Object[]{username},new BeanPropertyRowMapper<Spitter>(Spitter.class));
	}


	@Override
	public List<Spitter> findAllSpitters() {
		String sql = "select * from t_spitter s";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Spitter>(Spitter.class));
	}

}
