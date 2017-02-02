
public class Application23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine mach1 = new Machine();
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
