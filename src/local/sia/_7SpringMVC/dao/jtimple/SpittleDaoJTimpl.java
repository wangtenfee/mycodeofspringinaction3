package local.sia._7SpringMVC.dao.jtimple;

import java.util.List;


import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.dao.inter.SpittleDao;
@Repository
public class SpittleDaoJTimpl implements SpittleDao{
	
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public void deleteSpittle(long id) {
		String sql = "update t_spittle s set s.isdelete = true where s.id =?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Spittle getSpittleById(long id) {
		String sql = "select * from t_spittle s where s.id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Spittle>(Spittle.class));
	}

	@Override
	public List<Spittle> getRecentSpittle() {
		String sql = "select * from t_spittle s where s.isdelete = false and  s.postedtime < UNIX_TIMESTAMP(DATE_SUB(CURDATE(), INTERVAL 1 MONTH))";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Spittle>(Spittle.class));
		
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		String sql = "insert into t_spittle(spitter_id,spittleText)values(?,?)";
		jdbcTemplate.update(sql, spittle.getSpitter_id(),spittle.getSpittleText());
	}

	@Override
	public List<Spittle> getSpittlesByOwnid(long spitter_id) {
		String sql = "select * from t_spittle s where s.delete != false and s.spitter_id=?";
		return jdbcTemplate.query(sql, new Object[]{spitter_id}, new BeanPropertyRowMapper<Spittle>(Spittle.class));
	}

}
