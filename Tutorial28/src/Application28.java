
public class Application28 {

	public static void main(String[] args) {
		
		int intValue = 888;
		short shotValue = 55;
		byte byteValue = 20;
		long longValue = 345435;
		
		float floatValue = 45564.8f;
		float floatValue2 = (float)99.3;
		double doubleVlaue = 23.4;
	
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//128 is too big for a byte. hence it wont work as expected
		byteValue = (byte)128;
		System.out.println(byteValue);
		
		
		
		
	}

}
