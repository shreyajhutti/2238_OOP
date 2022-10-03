package chaiPackage;

import java.util.ArrayList;

public class Shop {
	
	private String state;
	//private Beverage beverage;
	
	public Shop(String s) {
	
		state = s;
		System.out.println("Location:");
	
	}
	
	public Beverage orderBeverage(Integer beverageType) {
		System.out.println("-----Order Beverage-----\n");
		
		
		Beverage beverage = new Beverage();   
		
	//	Order orderList[]= {};
		
		ArrayList<Beverage>orderList1 = new ArrayList<>();
		orderList1.add(new chai());
		orderList1.add(new coffee());
		orderList1.add(new latte());
		orderList1.add(new cookies());

		
		System.out.println("-----Finish Ordering beverage-----\n");
		return beverage;
		
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public char[] orderConfirmed(int i) {
		System.out.println("ORDER CONFIMED");
		return null;
	}

	

	
	
	
	/*
	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	*/
	
}
