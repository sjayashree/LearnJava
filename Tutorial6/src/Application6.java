
public class Application6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myint = 15;
		
		if (myint < 10) {
           System.out.println("True");
	} else if(myint >20)
	{
		System.out.println("False");
	}else
	{
		System.out.println("None of the above");
	}

		int loop = 0;
		
		while (true)
		{
			System.out.println(" Looping" + loop);
			
			if (loop ==5)
				break;
			loop++;
			System.out.println("Running");
		}
		
}

}