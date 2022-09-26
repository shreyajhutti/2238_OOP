package chaiPackage;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("-----Welcome to CHAIWALA-----");
		
		Shop shop = new Shop("Goa");
		System.out.println(shop.state);
		
	
		System.out.println(shop.orderBeverage(null));
	
	
		
	}

}
