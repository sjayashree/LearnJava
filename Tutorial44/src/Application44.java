
public class Application44 {
	/* declaring it old way without use of enum
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2; */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// old way --	int animal = CAT;
		Animal animal = Animal.CAT;
		
	/* old way 	
		switch(animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;  
			
		}*/
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		
		}
		
		System.out.println(Animal.DOG);
		
		System.out.println(Animal.DOG.getClass());
		
		System.out.println(Animal.CAT instanceof Enum);
		
		System.out.println(Animal.MOUSE.getName());
		
		System.out.println(Animal.CAT.toString());
		System.out.println(Animal.MOUSE.toString());
		System.out.println(Animal.DOG.toString());
	}

}
