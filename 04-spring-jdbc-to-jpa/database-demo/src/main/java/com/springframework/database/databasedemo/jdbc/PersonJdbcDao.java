package com.springframework.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
	// select * from person
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		return jdbcTemplate.query("select*from person", new BeanPropertyRowMapper(Person.class));
	}
}
