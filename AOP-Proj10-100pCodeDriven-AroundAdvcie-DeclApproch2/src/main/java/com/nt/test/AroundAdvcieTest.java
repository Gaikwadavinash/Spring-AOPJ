package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class AroundAdvcieTest {

	public static void main(String[] args) {
		//create IOC Container
AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);	
//getProxy Object

BankService proxy= ctx.getBean("bankService",BankService.class);
System.out.println(proxy.getClass() +"       "+proxy.getClass().getSuperclass());
//invoke the method
System.out.println("SimpleIntrestAmount:"+proxy.calSimpleIntrestAmount(1000.0f, 2.0f, 1.0f));
	System.out.println("===============================");
	System.out.println("SimpleIntrestAmount:"+proxy.calSimpleIntrestAmount(1000.0f, 2.0f, 1.0f));
	System.out.println("===============================");
	System.out.println("CompoundIntrestAmount:"+proxy.calCompoundIntrestAmount(1000.0f, 2.0f, 1.0f));	
	System.out.println("===============================");
	System.out.println("CompoundIntrestAmount:"+proxy.calCompoundIntrestAmount(1000.0f, 2.0f, 1.0f));
	
	}

}
