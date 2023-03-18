package com.springframework.database.databasedemo.jpa;

import org.springframework.stereotype.Repository;

import com.springframework.database.databasedemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//Repository
@Repository
//Transaction
@Transactional
public class PersonJpaRepository {
	//connect to the database
	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);//JPA
	}
	public Person update(Person person) {
		return entityManager.merge(person);//JPA
	}
	public Person insert(Person person) {
		return entityManager.merge(person);//JPA
	}
	public void deleteById(int id) {
		Person person= findById(id);
		entityManager.remove(person);//JPA
	}
	
}
