import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class Application30 {

	public static void main(String[] args){
		
		//Before Java 5
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);	
		
		////Modern Style/////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("Dog");
		strings.add("Koala");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		//Example2
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Mary");
		str.add("Jane");
		str.add("Alli");
		
		String name = str.get(2);
		System.out.println(name);
		
		
		///// More than one type argument /////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		///////Java 7 Style //////
		
		ArrayList<Animal> somelist = new ArrayList<>();
		
	}
}
