
class Plant {
	
	private String name;
	public static final int ID = 7;
	
	public String getData() {
		
		String data = " some stuff" + calculateGrowthForecast();
		 return data;
		}
	
	public int calculateGrowthForecast(){
		
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Application27 {

	public static void main(String[] args) {
		
		
	}

}
