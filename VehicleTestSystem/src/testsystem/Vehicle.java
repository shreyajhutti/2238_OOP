package testsystem;

public class Vehicle {
	protected Integer noOfTires;
	
	public Vehicle() {
		super();
	}

	
	public Boolean startVehicle1() {
		System.out.println("...starting VEHICLE...\n");
		return true;
	}
	
	public void startVehicle() {
		System.out.println("---starting Vehicle---\n");
	}
	
	public void startVehicle(Boolean keyless) {
		System.out.println("...starting a vehicle without key...\n");
	}
	
	public void stopVehicle() {
		System.out.println("...stopping a vehicle...\n");
	}
	
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	private Integer capacity;
	
	protected Integer Engine_capacity;
}
