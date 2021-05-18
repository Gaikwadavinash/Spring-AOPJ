package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterReturingAdviceTest {

	public static void main(String[] args) throws Throwable {
	//create IOC Container
ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext
("com/nt/cfgs/applicationContext.xml")	;	
try {
	
OnlineStore proxy= ctx.getBean("onlineStore",OnlineStore.class);	
	System.out.println(proxy.shopping( new String [] { "Jeans", "T-Shirt", "Kurta", "Shervani"}, new double[] {3000.0,5000.0,15000.0,20000.0} ));
	
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
