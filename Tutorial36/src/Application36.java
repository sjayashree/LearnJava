import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Application36 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Test test = new Test();
		
	/*	try {
			test.run();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to Parse :");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// Multi Catch 
		/*try {
			test.run();
		} catch (ParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		try {
		test.run();
	} catch (Exception e) {
			e.printStackTrace();
	}  
		
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
