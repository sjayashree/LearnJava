
class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(":").append(name);
		return sb.toString();
	}
	
}

public class Application21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog1 = new Frog(3, "Bally");
		Frog frog2 = new Frog(10, "Sally");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
