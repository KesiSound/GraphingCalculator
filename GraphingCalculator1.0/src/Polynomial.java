import java.util.ArrayList;

public class Polynomial {
	private String polynomial;
	private int degree;
	//Create arraylist of the polynomial
	//Use polynomial objects to generate points
	
	
	
	/** Constructor to the Polynomial class that creates a polynomial and its degree
	 * 
	 * @param polynomial
	 * @param degree1
	 */
	public Polynomial(String polynomial, int degree) {
		this.polynomial = polynomial;	
		this.degree = findDegree(polynomial);
		
	}
	
	
	
	/** Method that finds the degree of the polynomials
	 * 
	 * @param polynomial1
	 * @param polynomial2
	 * @return
	 */
	private int findDegree(String polynomial){
		int degree = 0;
		ArrayList<Integer> coefficientsPolynomial = stringToArray(polynomial);
		
		degree = coefficientsPolynomial.size();
		
		return degree;
	}
	
	
	
	
	//method for polynomial division
	
	public String division(Polynomial polynomial1, Polynomial polynomial2){
		String finalPolynomial = "";


		
		
		
		return finalPolynomial;
	}
	
	
	
	
	/** Helper method that converts the polynomial string to an ArrayList of coefficients
	 * @param polynomial
	 * @return
	 */
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
	
	
	/** Helper method that finds the greatest common factor of the polynomial
	 * 
	 * @param listCoefficients
	 * @return
	 */
	private int GCF(ArrayList<Integer> listCoefficients){
		int factor = 0;
		
		
		return factor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
