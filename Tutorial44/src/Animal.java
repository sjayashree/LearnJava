
public enum Animal {

	CAT("Sandy"),DOG("Browny"),MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This Animal is called " + name;
	}
}
