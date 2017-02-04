import java.io.IOException;

public class Test {

	public void run() throws ServerException {
		
		// 0 is success. Anythign else 1,2,3... failure
		
		int code = 1;
		
		if (code != 0) {
			//Something is wrong
			//throw new IOException("Could not open file:");
			throw new ServerException("Could not open file:");
		}
		
		System.out.println("Running from test");
	}
}
