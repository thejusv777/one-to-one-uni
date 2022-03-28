package com.ty.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Address;
import com.ty.one_to_one.dto.Branch;

public class SelectBranchDao {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
		Address address = branch.getAddress();
		
		System.out.println("Branch:-");
		System.out.println(branch.getName());
		System.out.println(branch.getPhone());
		System.out.println("Address:-");
		System.out.println(address.getArea());
		System.out.println(address.getPin());
		System.out.println(address.getState());
	}

}
