package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.service.BankService;

@SpringBootApplication
public class AopProj12BootAroundAdvcieDeclApproch2Application {

	public static void main(String[] args) {
AnnotationConfigApplicationContext 	ctx=(AnnotationConfigApplicationContext) SpringApplication.run(AopProj12BootAroundAdvcieDeclApproch2Application.class, args);
	

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
