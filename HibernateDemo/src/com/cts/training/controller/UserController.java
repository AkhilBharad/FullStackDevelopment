package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		
//		User user = new User(101, "user", "user@123", "user@cts.com", 7997589L, false);
//		
//		session.save(user);
		
		
		//To fetch the record of a User we will use get()method
		User getUser=session.get(User.class, 101);
//		getUser.setEnabled(true);
//		getUser.setPassword("123456");
//		session.update(getUser);
		
		
//		session.delete(getUser);
		
		List<User> users=session.createQuery("FROM User").list();
		users.forEach(System.out::println);
		transaction.commit();
		session.close();

	}

}
