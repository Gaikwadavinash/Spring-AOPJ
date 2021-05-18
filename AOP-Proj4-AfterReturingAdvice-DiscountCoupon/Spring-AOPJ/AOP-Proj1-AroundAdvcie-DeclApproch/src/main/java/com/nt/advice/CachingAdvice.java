package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CachingAdvice {

	private Map<String,Object> cacheMap= new HashMap();
	public Object performace(ProceedingJoinPoint pjp) throws Throwable{
	//prepare key
	String key=pjp.getSignature()+" "+Arrays.deepToString(pjp.getArgs());
		Object retVal=null; 
	if(!cacheMap.containsKey(key)) {
		retVal=pjp.proceed();//invoke target Methods
		cacheMap.put(key, retVal);
		System.out.println("CachingAdvice.performace()::From Target Method");
	}else {
		retVal=cacheMap.get(key);
		System.out.println("From Cache");
	}
		
		return retVal;
	}//end  
}//end class
