class Machine{
	
	private String name;
	private int code;
	
	public Machine(){
		this("Running this always", 9);
		System.out.println("Constructor Running!");
		name = "Arnie";
	}
	
	public Machine(String name){
		this(name,8);
		System.out.println("Second Constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		
		System.out.println("Third constructor Running!");
		this.name = name;
		this.code = code;
	}
}


public class Application18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Chalky", 10);
	}

}
