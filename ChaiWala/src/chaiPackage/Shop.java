package chaiPackage;

public class Shop {
	
	public String state;
	//private Beverage beverage;
	

	public Shop(String s) {
	
		state = s;
		System.out.println("State:");
	
	}
	
	public Beverage orderBeverage(String beverageType) {
		System.out.println("-----Ordeing a Beverage-----\n");
		
		
		Beverage beverage = new Chai();
		
		System.out.println("-----Finish Ordering beverage-----\n");
		return beverage;
		
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
