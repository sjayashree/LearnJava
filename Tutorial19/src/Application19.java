
class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		count++;
		}
	
	public void showName() {
		System.out.println("object id :" + id + "," + description + ":" + name);
	}
	
	public static void showinfo(){
		//System.out.println("Hello");
		System.out.println(description);
	}
}


public class Application19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thing.description = "Details of Thing object";
		Thing.showinfo();
		
		System.out.println("Before creating objects" +Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects" +Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		//System.out.println(Thing.description);
		thing1.showName();
		thing2.showName();
		
		
		
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
