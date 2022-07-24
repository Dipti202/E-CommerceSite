package com.app.fruits;

public class Mango extends Fruit {

	
	 public Mango(String color, double weight, String name)
	   {
		   super(color,weight,name);
	   }
	public String taste() {
		return "Sweet";
	}
	public void flavour(){
	return "Tasty like miranda";
}
//	In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
	public String pulp()
	{
		return "name: "+super.getName()+"color: "+super.getColor()+"   is pulpee fruit";
	}
	
}
