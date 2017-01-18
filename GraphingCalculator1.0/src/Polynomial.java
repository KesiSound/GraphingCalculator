import java.util.ArrayList;

public class Polynomial {
	private String polynomial;
	//Create arraylist of the polynomial
	//Use polynomial objects to generate points
	
	public Polynomial(String polynomial) {
		this.polynomial = polynomial;
	}
	
	
	//method for polynomial division
	
	public String division(String polynomial){
		ArrayList<Integer> polynomialCoefficients = stringToArray(polynomial);
		
		
		
		
		return polynomial;
	}
	
	
	//method for polynomial multiplication
	private static ArrayList<Integer> stringToArray(String polynomial){
		  ArrayList<Integer> coefficients = new ArrayList<Integer>();
		  int temp1 = 0;
	      //uses a for loop to go through the string then convert it into an ArrayList
	      for (int i = 0; i < polynomial.length(); i++){
	        String temp = polynomial.substring(i, i + 1);
	        if (temp == "x"){
	        	 temp1  = Integer.parseInt(temp);
	        	
	          continue;
	        }
	        else {
	          coefficients.add(temp1);
	        }
	      }

	      return coefficients;
	}
	
}
