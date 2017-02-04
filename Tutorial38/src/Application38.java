

public class Application38 {

	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		cam1.start();
		cam1.run();
	
		Car car1 = new Car();
		car1.setId(10);
		car1.start();
		car1.run();
	}

}
