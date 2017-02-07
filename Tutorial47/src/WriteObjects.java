import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing Objects...");
		
		Person[] people = {new Person(1,"Sue"), new Person(45,"Mike"), new Person(12, "Sally")};
		
		ArrayList<Person> peoplelist = new ArrayList<Person>(Arrays.asList(people));
		
		try (FileOutputStream fs = new FileOutputStream("test.ser");
				
				ObjectOutputStream os = new ObjectOutputStream(fs)){
			
			
			os.writeObject(people);
			
			os.writeObject(peoplelist);
			
			os.writeInt(peoplelist.size());
			
			for(Person person: peoplelist) {
				os.writeObject(person);
			}
			
			//os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
