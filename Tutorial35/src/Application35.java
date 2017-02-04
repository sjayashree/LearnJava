import java.io.IOException;

public class Application35 {

	public static void main(String[] args) {
		
		Test test = new Test();
		try {
			test.run();
		} catch (ServerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
