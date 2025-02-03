package com.in28minutes.spring.database.DatabaseDemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.spring.database.DatabaseDemo.entity.Person;

public interface PersonSpringDataRepo extends JpaRepository<Person, Integer>{

}
