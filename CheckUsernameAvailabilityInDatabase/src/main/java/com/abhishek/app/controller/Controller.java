package com.abhishek.app.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abhishek.app.entity.EntityRowMapper;
@RestController
public class Controller {

	
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	@PostMapping(value="/UserNameAvailability/{name}")
	public List<Entity> checkAvailabilty(@PathVariable("name")  String name) {
		int val=0;
		String sql="SELECT count(*) as exitValue FROM hr.departments where Department_Name='"+name+"'";
		System.out.println("sql  "+sql);
		List<Entity> exist=jdbcTemplate.query(sql, new EntityRowMapper());
		System.out.println("val "+val+"************");
		return exist;
	}
}
