package ru.spec.java.client;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ru.spec.java.ee.DateService;
import ru.spec.java.ee.TestBean;

public class Main {
	
	public static void main(String[] args) throws NamingException {
		Context ctx = new InitialContext();
		
		TestBean bean = (TestBean) ctx.lookup("test");
		
		String result = bean.echo("hello from client");
		System.out.println(result);
		
		DateService datebean = (DateService) ctx.lookup("Date");
		Date date = datebean.getDate();
		System.out.println(date);
		
	}

}
