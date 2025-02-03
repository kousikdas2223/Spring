package com.in28minutes.spring.database.DatabaseDemo.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.in28minutes.spring.database.DatabaseDemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery=  entityManager.createNamedQuery("find_all", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
	
	/*
	 * public Person findByName(String name){ return
	 * entityManager.find(Person.class, name); }
	 */
	public Person updateData(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insertData(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id) {
		Person personToBeDeleted = findById(id);
		entityManager.remove(personToBeDeleted);
	}

}
