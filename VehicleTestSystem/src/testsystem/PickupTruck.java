package testsystem;

public class PickupTruck extends Car implements Commercial{
	
	public PickupTruck() {
		super();
		
		System.out.println("...max weight allowed in this Vehicle = " +this.extracted());
	
	//	this.openStorageCompartment();
	}

	private Integer extracted() {
		return maxStorageWeight;
	}

	public void pickupTruck_engineTest() {
		TruckStartStop t = new TruckStartStop();
		t.startengine();
		System.out.println("--- ENGINE OK ---\n");
		t.stopengine();
	}
	/*
	@Override
	public void openStorageCompartment() {
		System.out.println("...opening storage compartment...\n");
	}
	
	*/
	
}
