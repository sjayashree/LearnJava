import world.Plant;

public class Grass extends Plant {

	public Grass() {
		
		//this wont work as grass is not in the same package as plant even though it is a subclass
		//System.out.println(this.height);
	}
}
