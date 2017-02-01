class Frog {
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}



public class Application17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog();
		
		frog1.setName("Bertie");
		frog1.setAge(4);
		
		System.out.println(frog1.getName());
	}

}
