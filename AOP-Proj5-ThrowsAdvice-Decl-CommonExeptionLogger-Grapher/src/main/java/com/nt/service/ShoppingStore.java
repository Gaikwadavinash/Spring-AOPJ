package com.nt.service;

public class ShoppingStore {
public double calShopping(double price,double qty) {
double billAmount=0.0;
System.out.println("ShoppingStore.calShopping()");

if(price<0.0||qty<0.0) 
	 throw new  IllegalArgumentException("Invalid  price and qty");
//calculate billAmount
billAmount=price*qty;
	return billAmount;
}
}
