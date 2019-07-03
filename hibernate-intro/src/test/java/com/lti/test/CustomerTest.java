package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.entity.Customer;
import com.lti.entity.CustomerDao;
;
public class CustomerTest {

	@Test
	public void testAdd() {
	Customer c=new Customer();
	c.setName("mirafel");
	c.setEmail("nnn@gmail.com");
	c.setCity("chennai");
	//c.setDateOfBirth(23-05-1997);
	
	CustomerDao dao=new CustomerDao();
	dao.databaseilAddSeiyavum(c);
	
	}
	@Test
	public void testFetch() {
		CustomerDao dao=new CustomerDao();
		Customer cust=dao.DatabaseIlvangudhal(3);
		System.out.println(cust.getId());
		System.out.println(cust.getName());
		System.out.println(cust.getEmail());
		System.out.println(cust.getCity());
	}
	
	@Test
	public void testUpdate() {
		
		CustomerDao dao=new CustomerDao();
		Customer cust=dao.DatabaseIlvangudhal(3);
		cust.setCity("bangalore");
		dao.DatabasiUpdateSeyavum(cust);
		
		
	}

}