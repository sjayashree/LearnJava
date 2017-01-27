
public class Application4 {

	public static void main(String[] args) {
		//Question 1
		
		int value = 0;
		
		while(value < 10)
		{
			System.out.println("Count of Hello :" + value);
			
			value = value + 1;
		} 
	
		// Question 2
		boolean flag = false;
		
		while (!flag)
		{
			System.out.println("this should print once");
			flag = true;
		}
		
		
		System.out.println("this should print multiple times");
		
		
		
		//Method 2 using for loop
		
		boolean doOnce = true;
	     while (true) {
	         if (doOnce) {
	             System.out.println("This should happen only once in the loop");
	             // Important now to turn of this doOnce flag :-)
	             doOnce = false;
	         }
	         
	         /* commenting this line intentionally from running into infinite loop
	         System.out.println("This keeps happening multiple times");
	         
	         */
	     }
			
	}

}
