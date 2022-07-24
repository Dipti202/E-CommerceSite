package com.app.fruits;

public class Fruit {
	private  String color ;
	 private double weight ; 
	private String name;
	private boolean fresh=true ;

	
	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		
	}

//added comment here
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}


	public String taste()
	{
	 return "no specific taste";	
	}
	//Override  toString correctly to return state of all fruits (return only  : name ,color , weight )
  
     public String toString()
     {
    	 return "Name: "+name+" color: "+color+" weight: " +weight;
    }


	public String getColor() {
		return color;
	}


	public double getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}


	public boolean isFresh() {
		return fresh;
	}



}

