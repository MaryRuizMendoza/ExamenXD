package com.softtek.repository.impl;

import java.util.Collections;
import java.util.List;



import com.softtek.examen.repository.Repositorio;

@Repository
public class StateRepository implements Repositorio<State, Long> {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private StateRowMapper stateRowMapper;
	
	@Override
	public State getOne(final Long id) {
		String sql = "SELECT * FROM state WHERE state_id = :id";
		return namedParameterJdbcTemplate.queryForObject(sql, Collections.singletonMap("id", id), stateRowMapper);
	}
	
	@Override
	public List<State> list() {
		String sql = "SELECT * FROM state ";
		return namedParameterJdbcTemplate.query(sql, stateRowMapper);
	}

	@Override
	public int add(State entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(State entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}

