import java.util.ArrayList;
import java.util.Scanner;

public class main {
	//Main!
	//Test
	static Scanner input = new Scanner(System.in);
	private static int[] arrayTerms;
	private static Integer[] coefficients;
	private static int tempCoefficient;
	private static String polynomial;
	private static ArrayList<Object> thing;
	
	private static String getInput() {
		String temp;
		System.out.println("Enter a valid polynomial please: ");
		temp = input.nextLine();
		return temp;
	}

	private static ArrayList<Integer> stringToArray(String polynomial){
		  ArrayList<Integer> coefficients = new ArrayList<Integer>();

	      //uses a for loop to go through the string then convert it into an ArrayList
	      for (int i = 0; i < polynomial.length(); i++){
	        String temp = polynomial.substring(i, i + 1);
	        if (temp == "x"){
	        	switch (temp){
	        	case "1":
	        	case "2": 
	        	
	        	}
	        	
	          continue;
	        }
	        else {
	          coefficients.add(temp);
	        }
	      }

	      return coefficients;
		
		
	}
}
