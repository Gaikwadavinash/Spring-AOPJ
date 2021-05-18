
package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceAdviceClasss {
public Object performace(ProceedingJoinPoint pjp) throws Throwable{
	System.out.println("PerformanceAdvcieClasss.performace()::(Before Entering)");
	long start=System.currentTimeMillis();
	System.out.println(start);
	Object retVal=pjp.proceed();//targetMethod
	System.out.println("PerformanceAdvcieClasss.performace()::(After Entering)");
	long end=System.currentTimeMillis();
	System.out.println(end);
	System.out.println(pjp.getSignature()+"  "+Arrays.toString(pjp.getArgs())+"Time"+(end-start) +"ms");
	return retVal;
			
}
}
