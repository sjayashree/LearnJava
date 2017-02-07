
public class Application46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Eg 4! = 4*3*2*1
		System.out.println(factorial(5));
		
	}

	private static int factorial(int value) {
	
		//System.out.println(value);
		
		if(value == 1) {
			return 1;
		}
		return factorial(value -1) * value;
	}
}
