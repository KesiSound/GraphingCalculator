
public class RegularCalcFunctions {
	//input: two doubles; output: double; function: adds two doubles together 
	public double Add(double a, double b){
		double c;
		c = a + b; 
		return c; 
	}
	//input: two doubles; output: double; function: subtracts two doubles together 
	public double Subtract(double a, double b){
		double c;
		c = a-b; 
		return c; 
	}
	//input: two doubles; output: double; function: divides two doubles together 
	public double Divide(double a, double b){
		double c = 0; 
		if(b == 0){
			System.out.println("Error: Cannot divide by zero");
		}
		else{
			c = a/b; 	
			return c; 
		}
		return c;
	
		
	}
	//input: two doubles; output: double; function: multiplies two doubles together 
	public double Multiply(double a, double b){
		double c;
		c = a * b; 
		return c; 
		
	}
	//input: two doubles; output: double; function: able to use exponents 
	public double Exponent(double a, double b){
		double c = Math.pow(a, b);
		return c; 
	}
	
	


}

