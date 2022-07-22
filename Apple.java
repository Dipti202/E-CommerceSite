package com.app.fruits;

public class Apple extends Fruit {

	
   public Apple(String color, double weight, String name)
   {
	   super(color,weight,name);
   }
	public String taste() {
		return "sweet and sour";
	}
}
	public String jam() {
		return "name: "+super.getName()+"  apple jam";
	//added }
}
