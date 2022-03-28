package com.ty.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Pan;
import com.ty.one_to_one.dto.Person;

public class SelectPersonDao {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = entityManager.find(Person.class, 1);
		Pan pan = person.getPan();
		
		System.out.println("Person:-");
		System.out.println(person.getName());
		System.out.println(person.getPhone());
		System.out.println(person.getGender());
		System.out.println("Pan:-");
		System.out.println(pan.getCountry());
		System.out.println(pan.getPanNumber());
		System.out.println(pan.getDate());
	}

}
