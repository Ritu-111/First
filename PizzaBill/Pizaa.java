package PizzaBill;

public class Pizaa {
	private int price;
	private Boolean veg;
	
	
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backpackprice=20;
	
	public Pizaa( Boolean veg) {
		
		this.veg = veg;
		
		if(this.veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
	}
	
	
	
	public void AddExtraCheese() {
		System.out.println("Exta cheese added");
		this.price+=extraCheesePrice;
		
	}
	
	public void addExtraTopping() {
		System.out.println("Exta Toppings added");
		this.price+=extraToppingsPrice;
	}
	
	public void takeAway() {
		System.out.println("Take Away Opted");
		this.price+=backpackprice;
		
	}
	
	public void getBill() {
		System.out.println(this.price);
	}
	
	
	

}
