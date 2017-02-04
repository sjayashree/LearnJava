import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application33 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub

		//String filename = "C:/Users/AnandGirish/Downloads/test.txt";
		
		String filename = "test.txt";
		
		File textfile = new File(filename);
		
		
			Scanner in = new Scanner(textfile);
			
			int value = in.nextInt();
			System.out.println("Read Value: " + value);
			in.nextLine();
			
			int count = 2;
			while(in.hasNextLine()){
				String line = in.nextLine();
				System.out.println(count + ":" + line);
				count++;
			}
			
			in.close();
				
		
	}

}
