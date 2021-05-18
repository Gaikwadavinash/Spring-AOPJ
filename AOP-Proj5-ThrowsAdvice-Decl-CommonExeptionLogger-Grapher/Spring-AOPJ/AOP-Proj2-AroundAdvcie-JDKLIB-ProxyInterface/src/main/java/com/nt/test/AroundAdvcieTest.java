package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IBankService;

public class AroundAdvcieTest {

	public static void main(String[] args) {
		//create IOC Container
	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");	
//getProxy Object

IBankService proxy= ctx.getBean("bankService",IBankService.class);
System.out.println(proxy.getClass() +"       "+proxy.getClass().getSuperclass()+"        "+Arrays.deepToString(proxy.getClass().getInterfaces()));
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
