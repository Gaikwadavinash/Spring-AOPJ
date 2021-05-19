package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.CarShowRoom;

public class BeforeAdvcieTest {

	public static void main(String[] args) throws Throwable {
	//create Ioc Container
AnnotationConfigApplicationContext  ctx= new AnnotationConfigApplicationContext(AppConfig.class);
 
//create TargetClass/ServiceClass
CarShowRoom proxy= ctx.getBean("cShowRoom", CarShowRoom.class);
System.out.println(proxy.getClass()+"       "+proxy.getClass().getSuperclass());
try {
//invoke the method
System.out.println(proxy.cellCar("Raja", "baleno",500000.0));
System.out.println("=================================");
System.out.println(proxy.cellCar("Raja", "creata",50.0));
}catch (Exception e) {
	e.printStackTrace();
}
}

}
