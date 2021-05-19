package com.nt.advice;
import java.io.FileWriter;

import java.io.Writer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component("discountCode")
@Aspect
public class DiscountCouponAdvice {
/*	
public void genrateCouponCode(JoinPoint  jp,double billAmount) throws Throwable{
System.out.println("DiscountCouponAdvice.genrateCouponCode()");	
String cuponMsg=null;
if(billAmount<50000) 
cuponMsg="you got 35%p CashBack for Next Order";
else if(billAmount<20000)
	cuponMsg="you got 20%p CashBack for Next Order";
else if(billAmount<10000)
	cuponMsg="you got 8%p CashBack for Next Order";
else
cuponMsg="you got 3%p CashBack for Next Order ";
//generate the cupon
		Writer writer =new FileWriter("F:\\Log\\Discounts.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
		
}
*/
@AfterReturning(pointcut ="execution(double com.nt.service.OnlineStore.shopping(..)) and args(items,prices)",returning = "billAmount")
	public void genrateCouponCode(String items,double prices,double billAmount) throws Throwable{
		System.out.println("DiscountCouponAdvice.genrateCouponCode()");	

		String cuponMsg=null;
		if(billAmount<50000) {
			System.out.println(billAmount);
		cuponMsg="you got 35%p CashBack for Next Order";
		}	else if(billAmount<20000)
			cuponMsg="you got 20%p CashBack for Next Order";
		else if(billAmount<10000)
			cuponMsg="you got 8%p CashBack for Next Order";
		else
		cuponMsg="you got 3%p CashBack for Next Order ";
		//generate the cupon
				Writer writer =new FileWriter("F:\\Log\\Discounts.txt");
				writer.write(cuponMsg);
				writer.flush();
				writer.close();
				
		}
}


