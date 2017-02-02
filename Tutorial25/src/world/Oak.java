package world;

public class Oak extends Plant{

	public Oak() {
		
		//wont work -- type is private
		//type = "Oak";
		
		//This works because size is protected and Oak is a subclass of plant
		this.size = "large";
		//No access specifier works because oak and plant are in the same package
		this.height = 10;
	}
}
