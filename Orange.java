package com.app.fruits;

public class Orange extends Fruit{
	
	
	 public Orange(String color, double weight, String name)
	   {
		   super(color,weight,name);
	   }
	public String taste() {
		return "sour";
	}
	
	//In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}

	public String juice() {
		return "Name: "+super.getName()+" weight: "+super.getWeight()+"  Orange juice is ready";
	}
	
}
