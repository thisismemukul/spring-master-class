package com.springframework.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springframework.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
	// select * from person
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			return person;
		}
		
	}

	public List<Person> findAll() {
		return jdbcTemplate.query("select*from person", new PersonRowMapper());
	}
//	public <T> T findById(int id) {
//		return jdbcTemplate.queryForObject("select*from person where id=?", (RowMapper<T>) new BeanPropertyRowMapper<Person>(),new Object [] {id});
//	}
	public Person findById(int id) {
	    return jdbcTemplate.queryForObject("select * from person where id = ?",
	            new Object[] {id},
	            new int[] {1},
	            new PersonRowMapper());
	}
	public int deleteById(int id) {
		return jdbcTemplate.update
				("delete from person where id=?", new Object[] { id });
	}
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id, name, location) " + "values(?,  ?, ?)",
				new Object[] { person.getId(), person.getName(), person.getLocation()});
	}

	public int update(Person person) {
		return jdbcTemplate.update("update person " + " set name = ?, location = ?" + " where id = ?",
				new Object[] { person.getName(), person.getLocation(), person.getId() });
	}
}
