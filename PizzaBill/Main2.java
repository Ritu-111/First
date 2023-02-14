package PizzaBill;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("For veg pizaa Enter True And For NOnveg Pizaa Enter False:");
		boolean v=s.nextBoolean();
		
		Pizaa basePizza=new Pizaa(v);
		
		System.out.println("do you want to add Extra toppings Enter 1");
		int t=s.nextInt();
		if(t==1) {
			basePizza.addExtraTopping();	
			
		}
		System.out.println("do you want to add Extra cheese Enter 2");
		int c=s.nextInt();
		if(c==2) {
			basePizza.AddExtraCheese();	
			
		}
		
		System.out.println("do you want to Take Away Pizaa Enter 3");
		int a=s.nextInt();
		if(a==3) {
			basePizza.takeAway();	
			
		}
		
		basePizza.getBill();
		

	}

}
