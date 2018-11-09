package com.abhishek.app.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class EntityRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	Entity entity= new Entity();
	entity.setExit(rs.getInt("exitValue"));
    return entity;
	}

}
