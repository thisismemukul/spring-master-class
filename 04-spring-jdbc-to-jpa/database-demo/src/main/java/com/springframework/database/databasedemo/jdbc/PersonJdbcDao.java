package com.springframework.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springframework.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
	// select * from person
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		return jdbcTemplate.query("select*from person", new BeanPropertyRowMapper(Person.class));
	}
//	public <T> T findById(int id) {
//		return jdbcTemplate.queryForObject("select*from person where id=?", (RowMapper<T>) new BeanPropertyRowMapper<Person>(),new Object [] {id});
//	}
	public Person findById(int id) {
	    return jdbcTemplate.queryForObject("select * from person where id = ?",
	            new Object[] {id},
	            new int[] {1},
	            new BeanPropertyRowMapper<Person>(Person.class));
	}
}
