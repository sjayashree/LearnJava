
public class Robot {

	private int id;
	
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	static class Battery {
		
		public void charge() {
			System.out.println("Battery Charging");
		}
	}
	public Robot(int id) {
		
		this.id = id;
	}
	
	public void start() {
		System.out.println("starting Robot : " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		class Temp {
			
			public void doSomething() {
				System.out.println("Id is :" + id);
				System.out.println(" My name is : " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
}
