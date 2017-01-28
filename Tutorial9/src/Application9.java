import java.util.Scanner;

public class Application9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a command start/stop :");
		String text = input.nextLine();
		
		switch(text) {
		
		case "start" :
			System.out.println(" In Start");
			break;
			
		case "stop" :
			System.out.println(" In Stop");
			break;
			
			default:
				System.out.println("Command not supported");
		}
	}

}
