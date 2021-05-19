//targetClass
package com.nt.service;

import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Service;

@Service("bankService")
public class BankService {


	//BusinessMethod1

	public double calSimpleIntrestAmount(float pAmt,float rate,float time) {
	System.out.println("BankService.calSimpleIntrestAmount()");
	return (pAmt*rate*time)/100.0f;
}

	//BusinessMethod2
public double calCompoundIntrestAmount(float pAmt,float rate,float time) {
System.out.println("BankService.calCompoundIntrestAmount()");
	return (pAmt*Math.pow(1+rate/100,time))-pAmt;
}


}
