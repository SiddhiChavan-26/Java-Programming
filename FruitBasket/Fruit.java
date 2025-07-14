package com.app.fruits;

 public class Fruit {
	protected String color;
	protected double weight;
	protected String name;
	protected boolean isFresh;
	
	public Fruit() {
		//TODO
	}
	public Fruit(String color , double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	//getters and setters 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	public void taste() {
		System.out.println("NO specific taste");
	}
	
	//toString()
//	public String toString() {
//		//return "Color of fruit: "+ this.color +"Weight of fruit: "+ this.weight +"Name of fruit: "+ this.name +"Is fruit fresh: "+ this.isFresh;
//	}
	
	public void acceptRecord(Fruit f1) {
		// TODO 
		
	}
	
}
