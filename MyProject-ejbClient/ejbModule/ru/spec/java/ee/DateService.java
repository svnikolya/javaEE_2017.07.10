package ru.spec.java.ee;

import java.util.Date;

import javax.ejb.Remote;

@Remote
public interface DateService {

	Date getDate();

	long increment();

}