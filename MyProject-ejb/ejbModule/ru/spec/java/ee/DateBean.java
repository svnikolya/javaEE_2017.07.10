package ru.spec.java.ee;

import java.util.Date;
import java.util.concurrent.Future;

import javax.annotation.PostConstruct;
import javax.ejb.AsyncResult;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;



@Stateless(mappedName = "DateBean")
@LocalBean
public class DateBean implements DateService {
	@Inject
	TestBeanImpl test;
	
	@Inject
	long rnd;
	
	long count = 0;
	
	@Override
	@
	public Future<Long> increment() {
		return new AsyncResult<Long>(count++);
	}
	
	@Override
	public Date getDate() {
		test.echo("Im get date");
		return new Date();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("------new DateBean "
				+ Thread.currentThread());
	}

}
