
public class Application20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder";
		
		System.out.println(info);
		
		//More Efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append(" I am a lion tamer");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger") .append(" ")
		.append("I am a skydiver");
		
		System.out.println(s.toString());
		
		// Formatting 
		
		System.out.println("Here is some text.\tThat was a tab\nThat was a new line\n");
	System.out.println("More text");
	
	System.out.printf("Total cost is %10d : quantity is %d\n", 5, 120);
	
	for(int i=0; i<20; i++) {
		System.out.printf("%2d:  %s\n",i,"Some text here");
	}
	
	//formatting floating point values
	System.out.printf("Total value : %.2f\n", 5.6890);
	System.out.printf("Total value : %-6.1f\n", 343.4565656);
	
	
	}
	

}
