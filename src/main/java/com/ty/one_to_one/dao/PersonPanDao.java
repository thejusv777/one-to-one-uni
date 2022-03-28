package com.ty.one_to_one.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Pan;
import com.ty.one_to_one.dto.Person;
/*
 *person dao
 */
public class PersonPanDao {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		Pan pan = new Pan();
		
		person.setName("Manoj");
		person.setPhone(123458);
		person.setGender("Male");
		
		pan.setPanNumber(99887768);
		pan.setDate(LocalDate.now());
		pan.setCountry("India");
		
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
	}

}
