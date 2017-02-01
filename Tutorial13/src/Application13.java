
class Person{
	
	String name;
	int age;
	
	void speak(){
		for (int i=0; i<3; i++){
		System.out.println("My name is :" + name + "and I am " + age + " years old ");
	}
 }
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

class Fruit{
	
	String name;
	String colour;
}

public class Application13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		
		person1.name = "Hello Kitty";
		person1.age = 25;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		
		person2.name = "John Barry";
		person2.age = 40;
		person2.speak();
		person2.sayHello();
		
		System.out.println("Person1 Details: " + person1.name + person1.age);
		System.out.println("Person2 Details: " + person2.name + person2.age);
		
		//Example 2
		
		Fruit fruit1 = new Fruit();
		fruit1.name = "Mango;";
		fruit1.colour = "Yellow";
		
		System.out.println("Fruit1 Details: " + fruit1.name + fruit1.colour);
		
		
	}

}
