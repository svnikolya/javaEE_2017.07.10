package ru.spec.java.ee;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

@Singleton(mappedName="MySingleton")
@LocalBean
public class MySingleton implements MySingletonRemote {
	
	public MySingleton() {
		System.out.println("+++MySingleton() "+Thread.currentThread());

    }
	
	

}
