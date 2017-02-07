
class Person {
	
	private String name;
	private int id;
	
	public Person(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class Application42 {

	public static void main(String[] args) {
		
		System.out.println(new Object());
		
		Person person1 = new Person("Bob", 6);
		Person person2 = new Person("Bob", 6);
		
				
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1.equals(value2));
		
		int num1 = 6;
		int num2 = 6;
		
		System.out.println(num1 == num2);
		
		String text1 = "hello";
		String text2 = "hellodfaf".substring(0, 5);
		
		System.out.println(text2);
		System.out.println(text1.equals(text2));

	}

}
