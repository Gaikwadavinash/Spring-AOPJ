package com.nt.service;

import org.springframework.stereotype.Service;

@Service("cShowRoom")
public class CarShowRoom {

	public String  cellCar(String custName,String carModel,Double price) throws Throwable{
		
		if(carModel.equalsIgnoreCase("baleno")) {
			return "Car "+carModel+" is Sold Out at Price::"+price+" to custmer::"+custName;
		}
		else {
			return  "Car "+carModel +" is not avaiable for sale"; 
		}
	
	}
}
	
