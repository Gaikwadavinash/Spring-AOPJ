//targetClass ,MainClass,ServiceClass
package com.nt.service;

public class OnlineStore {
public double shopping(String items[],double prices[]) throws Throwable{
System.out.println("OnlineStore.shopping()");

//calculalte BillAmount
double billAmount=0.0;
for(double p:prices) {
	billAmount=billAmount+p;

}

return billAmount;	
}
}
