import world.Plant;

/*

private - only within the class
protected - same class, sub class and same package
public - from anywhere
no modifier - same package only

*/
public class Application25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//This wont work as size is protected and App is not in the same package as Plant
		// System.out.println(plant.size);
		
		//Wont work as App and plan are in different packages and height has package level visibility
		//System.out.println(plant.height);
	}

}
