package com.cts.training.test;

import static org.junit.Assert.*;



import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.Company;
import com.cts.training.dao.CompanyDAO;

public class CompanyUnitTest {
	
	
	private static  AnnotationConfigApplicationContext context;
	private static CompanyDAO companyDAO;
	private static Company company;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		company =(Company) context.getBean("company");
		companyDAO =(CompanyDAO) context.getBean("companyDAO");
	}

	
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	

}
 