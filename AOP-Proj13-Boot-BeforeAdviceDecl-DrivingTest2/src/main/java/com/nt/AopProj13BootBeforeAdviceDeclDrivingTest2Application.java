package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.service.CarShowRoom;

@SpringBootApplication
public class AopProj13BootBeforeAdviceDeclDrivingTest2Application {

	public static void main(String[] args)throws Throwable {
ApplicationContext ctx=SpringApplication.run(AopProj13BootBeforeAdviceDeclDrivingTest2Application.class, args);
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

