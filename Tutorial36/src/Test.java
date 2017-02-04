import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Test {

	public void run() throws IOException, ParseException {
		
		//throw new IOException();
		
		throw new ParseException("Error in cmd list.", 2);
	}
	
	public void input() throws IOException, FileNotFoundException {
		
	}
}
