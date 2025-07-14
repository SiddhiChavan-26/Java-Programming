package com.app.fruits;
import java.util.Scanner;

public class Apple extends Fruit {
	public Apple() {
		//TODO
	}
	
	public Apple(String color , double weight, String name, boolean isFresh) {
		super(color,weight, name,true);
	}
	
	
	@Override
	public void taste() {
		System.out.println("Taste of Apple: Sweet and sour");
	}
	
	@Override
	public String toString() {
		return "Color of fruit: "+ this.color +"\tWeight of fruit: "+ this.weight +"\tName of fruit: "+ this.name +"\tIs fruit fresh: "+ this.isFresh;
	}
}
