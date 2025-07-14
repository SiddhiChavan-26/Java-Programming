package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);
	
	
	
	//for menu printing
	public static int menuList() {
		int choice;
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display all fruit names");
		System.out.println("5.Display details of fresh fruits");
		System.out.println("6.Mark fruit stale");
		System.out.println("7.Diplay taste of all stale fruits");
		
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		//System.out.println();
		return choice;
	}
	
	
	public static void main(String[] args) {
		
		int size;
		System.out.print("Enter size of fruit basket: ");
		size = sc.nextInt();
		
		Fruit [] Basket = new Fruit[size];
		
		
		int choice;
		int count = 0;
		
		Fruit f1 = null;
		
		while((choice = menuList()) != 0) {
			switch(choice) {
			case 1: 
				System.out.println("Add Mango: ");
				if(count < Basket.length) {
					
					System.out.print("Enter fruit color: ");
					String color = sc.next();
					System.out.print("Enter fruit weight: ");
					double weight = sc.nextDouble();
					System.out.print("Enter fruit name: ");
					String name = sc.next();
					
					Basket[count++] = new Mango(color, weight, name, true);
				}else {
					System.out.println("Can not add more fruits\nCapacity is full");
				}
				break;
			case 2:
				System.out.println("Add Orange: ");
				if(count < Basket.length) {
//					System.out.println();
					
					System.out.print("Enter fruit color: ");
					String color = sc.next();
					System.out.print("Enter fruit weight: ");
					double weight = sc.nextDouble();
					System.out.print("Enter fruit name: ");
					String name = sc.next();
					
					Basket[count++] = new Orange(color, weight, name,true);
				}else {
					System.out.println("Can not add more fruits\nCapacity is full");
				}
				break;
				
			case 3:
				System.out.println("Add Apple: ");
				if(count < Basket.length) {
					System.out.print("Enter fruit color: ");
					String color = sc.next();
					System.out.print("Enter fruit weight: ");
					double weight = sc.nextDouble();
					System.out.print("Enter fruit name: ");
					String name = sc.next();
					
					Basket[count++] = new Apple(color, weight, name,true);
				}else {
					System.out.println("Can not add more fruits\nCapacity is full");
				}
				break;
				
			case 4:
				System.out.println("Names of all fruits in Basket: ");
				for(Fruit f : Basket ) {
					if(f != null) {
						System.out.println(f.getName());
					}
				}
				break;
				
			case 5:
//				Fruit fr1 = new Fruit();
				System.out.println("Fresh fruits: ");
				for(int i=0; i< Basket.length; i++) {
					String str = Basket[i].toString();
					System.out.println(str);
					Basket[i].taste();
				}
				break;
				
			case 6:
				System.out.println("Make fruit stale: ");
				int index = -1;
				System.out.println();
				System.out.println("Enter index to make fruit stale: ");
				index = sc.nextInt();
				if(index < Basket.length) {
					Basket[index].setFresh(false);
					boolean f = Basket[index].isFresh();
					System.out.print(+ index +" isFresh: "+ f);
				}else {
					System.out.println("Invalid index.");
				}
				
				break;
				
			case 7:
				System.out.println("Stale fruit names: ");
				for(int i=0; i< Basket.length;i++) {
					if(Basket[i].isFresh() == false) {
						System.out.println("Name: " +Basket[i].getName());
					}
						
				}
			}//switch
			
		}//while
		

	}

}
