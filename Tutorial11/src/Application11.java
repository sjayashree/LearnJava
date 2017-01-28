
public class Application11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 7;
		
		int[] values;
		values = new int[4];
		
		values[0] = 1;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		/*
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		*/
		
		
		for (int i=0; i <values.length; i++){
			
			System.out.println(" Array 1: " + values[i]);
		}
		
		int[] numbers = {5,6,7};
		
		for (int i=0; i <numbers.length; i++){
			
			System.out.println(" Array 2 :" + numbers[i]);
		}
		
		// String Arrays
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println("Printing the words Array: \n" + words[0] + words[1] + words[2]);
		
		String[] fruits = {"Apple", "Mango", "Guava", "Pear"};
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		
		//Multi Dimensional Array
		
		int[][] grid = {
				{3,4,5667},
				{3,6},
				{1,3454,56,7}
		};
		
		//This should print row1 column1 - 6
		System.out.println(grid [1][1]);
		//This should print row 0 col 2 - 5667
		System.out.println(grid [0][2]); 
		
		String[][] test = new String[2][3];
		
		test[0][1] = "printing 0th row and 1 column data";
		System.out.println(test[0][1]);
		
		for(int row=0; row<grid.length; row++){
			for(int col=0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}
			
			System.out.println();
		}
		
		String[][] st = new String[2][1];
		//System.out.println(st[0]);
		st[0] = new String[3];
		st[0][1] = "Hello there";
		
		System.out.println(st[0][1]);
		
		}
	}

