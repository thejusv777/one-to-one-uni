package com.ty.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Address;
import com.ty.one_to_one.dto.Branch;

public class BranchDao {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Address address = new Address();
		Branch branch = new Branch();
		
		branch.setName("QSP");
		branch.setPhone(1234);
		
		address.setArea("R T Nagar");
		address.setPin(560032);
		address.setState("KARNATAKA");
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(address);
		entityManager.persist(branch);
		
		
		entityTransaction.commit();
	}

}
