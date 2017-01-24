
public class ArrayChallenge1 {

	public static void main(String[] args) {
		//1. Create a string array with four or five elements. Print the third element.
		String numbers[]= new String [5];
		numbers [0] = "Apple";
		numbers [1] = "Bannana";
		numbers [2] = "Orange";
		numbers [3] = "Mango";
		numbers [4] = "Pomegranate";
		        
		System.out.println(numbers[2]);
		
		//2. Create an array of integers with four or five elements. Print the last one. 
		int candy[]= new int [5];
		candy [0] = 1; 
		candy [1] = 2;
		candy [2] = 3;
		candy [3] = 4;
		candy [4] = 5; 
		
		System.out.println(candy[4]);
		
		//3. Using the int array, print all the numbers in a vertical column. Hint: Use a for loop.
		int matrix[]= new int [5];
		matrix [0] = 1;
		matrix [1] = 2;
		matrix [2] = 3;
		matrix [3] = 4;
		matrix [4] = 5;
		
		for(int i =0; i < 6; i++)
		{
			System.out.println(matrix[i]);
		}
	    //4. USing the same int array, print all the numbers in a vertical column. Hint: Use a for loop. 
		
		int cali[]= new int [5];
		matrix [0] = 1;
		matrix [1] = 2;
		matrix [2] = 3;
		matrix [3] = 4;
		matrix [4] = 5;
		
		for(int i =0; i < 6; i++)
		{
			System.out.println(cali[i]);
		}
		
  
	
	
	
	
	
	}

}
