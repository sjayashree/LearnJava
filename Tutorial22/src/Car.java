
public class Car extends Machine {

	
	
	@Override
	public void start() {
		System.out.println("Car Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}

	public void wipeWindShield(){
		System.out.println("Wiping Wind Shield");
	}
	
	public void showInfo(){
		System.out.println("Car info" + name);
	}
}
