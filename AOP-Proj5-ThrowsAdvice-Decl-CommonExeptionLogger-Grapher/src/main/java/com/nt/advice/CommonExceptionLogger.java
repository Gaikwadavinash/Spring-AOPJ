package com.nt.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

import com.nt.exception.InternalProblemException;

public class CommonExceptionLogger {

	public void exceptionLogger(JoinPoint jp,IllegalArgumentException iae) throws Throwable{
		
	//common exception logger
		Writer writer= new FileWriter("F:\\Log\\throwsAdvcie.txt",true);
		writer.write(jp.getSignature()+ " with args  "+Arrays.toString(jp.getArgs())+"  has raised exception"+iae);
	writer.flush();
	writer.close();
	//Exception transalation/Graphing
			throw new  InternalProblemException(jp.getSignature()+" with args"+Arrays.toString(jp.getArgs())+" has rasied exception ");
	}
}
