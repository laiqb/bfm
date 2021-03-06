package com.bfm.test.bondInstrSubmit;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bfm.domain.bean.Customer;

public class test {
	 public static void main(String[] args) {

	        try {
	            SessionFactory sf =
	                new Configuration().configure().buildSessionFactory();
	            Session session = sf.openSession();
	            Transaction tx = session.beginTransaction();

	            for (int i = 0; i < 200; i++) {
	                Customer customer = new Customer();
	                customer.setUsername("customer" + i);
	                customer.setPassword("customer");
	                session.save(customer);
	            }

	            tx.commit();
	            session.close();

	        } catch (HibernateException e) {
	            e.printStackTrace();
	        }
	    }
}
