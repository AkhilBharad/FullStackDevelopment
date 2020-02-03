package com.cts.training.controller;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.cts.training.bean.Employee;
import com.cts.training.bean.PassportDetails;
import com.cts.training.bean.Person;
public class MappingController {
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria =session.createCriteria(Person.class);
//		Person p=(Person)criteria.uniqueResult();
//		System.out.println(p.getName());
//		
//List<Person> persons=criteria.add(Restrictions.eq("name","HAMEEM")).list();
		List<Person> persons=criteria.add(Restrictions.gt("id",16)).list();

for(Person p:persons)
{
	System.out.println(p.getPassport().getPassportNumber());
}
		tx.commit();
		session.close();
//		Person person =new Person();
//		person.setName("Hameem");
//		
//		PassportDetails pDetails=new PassportDetails();
//		pDetails.setPassportNumber("YH234567");
//		person.setPassport(pDetails);
//	pDetails.setPerson(person);
//		session.save(person);
//		
//		tx.commit();
//		session.close();
//		
	}
}