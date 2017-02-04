
class Machine {
	
	public void start() {
		System.out.println("Starting Machine ......");
	}
} 

interface Plant {
	public void grow();
}

public class Application32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine(){
			@Override public void start(){
				System.out.println("Camera Snapping");
			}
		}; 
		
		machine1.start();
		
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant Growing...");
				
			}
			
		};
		
		plant1.grow();
	}

}
