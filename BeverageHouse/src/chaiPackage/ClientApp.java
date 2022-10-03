package chaiPackage;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("-----Welcome to CHAIWALA-----\n");
		
		Shop shop = new Shop("Goa\n");
		System.out.println(shop.getState());              
		
		
		System.out.println(shop.orderBeverage(1));
	
		System.out.println(shop.orderConfirmed(1));
		
	}

}
