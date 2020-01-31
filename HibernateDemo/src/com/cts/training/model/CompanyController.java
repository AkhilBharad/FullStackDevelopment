package com.cts.training.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	
//		Company company=new Company(101, "CTS", "Digital Transformation", "Brian Hamphrac", 568359833.676);
//		session.save(company);
//		
		
		StockExchange se=new StockExchange(1,"BSE","Mumbai","MutualFunds");
		session.save(se);
		
		transaction.commit();
		session.close();
	}

}
