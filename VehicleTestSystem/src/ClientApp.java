
import testsystem.*;

public class ClientApp {

	public static void main(String[] args) {
		
		Vehicle a = new Vehicle();
		Car b = new Car();
		Vehicle c = new Car();
	//	Commercial C = new Commercial();
		PickupTruck p = new PickupTruck();
		a.startVehicle();
		
		b.startVehicle();
		
		c.startVehicle();	
		
	//	p.openStorageCompartment();
		p.pickupTruck_engineTest();
		
		a.stopVehicle();
	}

}
