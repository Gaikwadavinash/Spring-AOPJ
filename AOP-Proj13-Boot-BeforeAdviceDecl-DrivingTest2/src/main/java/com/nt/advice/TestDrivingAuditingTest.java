/*
package com.nt.advice;

import java.io.FileWriter;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDrivingAuditingTest {

	public void testDriving(JoinPoint jp) throws Throwable{
	
	Object args[]=jp.getArgs();	
	
String auditLogMessage=	args[0]+" Custmer has come for testDriving of "+args[1]+" model car on"+new Date();

FileWriter writer= new FileWriter("F:\\Log\\testAudit.txt",true);
writer.write(auditLogMessage);
writer.flush();
writer.close();
	}
	
}
*/


package com.nt.advice;

import java.io.FileWriter;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component("testDrive")
@Aspect
public class TestDrivingAuditingTest {
@Before(value ="execution(java.lang.String com.nt.service.CarShowRoom.cellCar(..)) and args(custName,carModel,price))" )
	public void testDriving(String custName,String carModel,Double price) throws Throwable{
	System.out.println("TestDrivingAuditingTest.testDriving()");
String auditLogMessage=	custName+" Custmer has come for testDriving of "+carModel+" model car on"+new Date();

FileWriter writer= new FileWriter("F:\\Log\\testAudit.txt",true);
writer.write(auditLogMessage);
writer.flush();
writer.close();
	}
	
}