package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {

	public Object performace(ProceedingJoinPoint pjp) throws Throwable{
		
System.out.println("PerformanceMonitoringAdvice.performance()::(Before Entering)");
		
long start=System.currentTimeMillis();
System.out.println(start);
//modify target method args value
Object args[]=pjp.getArgs();


if(((float)args[0])<500){
args[0]=(float)args[0]-0.5;
}

//controlling target method execution
if((float)args[0]<=0||(float)args[1]<=0||(float)args[2]<=0) 
	throw new IllegalArgumentException("Invalid Input");
Object retVal=pjp.proceed();	

long end=System.currentTimeMillis();
System.out.println(end);
System.out.println("PerformanceMonitoringAdvice.performance()::(AfterExecuting)");

System.out.println(  pjp.getSignature()+"   "+Arrays.toString(pjp.getArgs())+" "+pjp.getClass()+" "+pjp.getClass().getSuperclass());
		
System.out.println(end-start);
//modify the return value
 retVal=(float)retVal+(float)retVal*0.1;

return retVal;
	}

	
}
