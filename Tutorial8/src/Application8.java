import java.util.Scanner;

public class Application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		/*
		System.out.println(" Enter a Number :");
		int value = scanner.nextInt();
		
		while(value != 5)
		{
			System.out.println(" Enter a Number :");
		     value = scanner.nextInt();
		} */
		
		do {
			
			System.out.println(" Enter a Number :");
			 value = scanner.nextInt();
		}
		while(value != 5);
		System.out.println(" Got 5 input values");
	}

}
