
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting a Car");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do Stuff for Car");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down a car");
		
	}

}
