package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.exception.InternalProblemException;
import com.nt.service.ShoppingStore;

public class ThrowsAdvcie {

	public static void main(String[] args) {
		//create IOC Conatianr
		
ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext
("com/nt/cfgs/applicationContext.xml");
//target Class
ShoppingStore proxy=ctx.getBean("sStore",ShoppingStore.class);
try {
	System.out.println("BillAmpunt:"+proxy.calShopping(-5000, 5));
}catch (InternalProblemException iae) {
iae.getMessage();
iae.printStackTrace();
}
System.out.println("=================================");
try {
	System.out.println("BillAmount ::"+proxy.calShopping(40000, 0));
}
catch(InternalProblemException iae) {  // we can do this only when taraget method throws   uncheckceptions
	iae.printStackTrace();
	iae.printStackTrace();
}
	}

}
