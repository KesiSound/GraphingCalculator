
import java.util.ArrayList;
import java.util.Collections;

public class GraphingCalcFunctions {
	public static double LocalMin( ArrayList yCoordinates){
		double a = (double) Collections.max(yCoordinates); 
		for(int i =0; i< yCoordinates.size(); i++){
			if (a > (double)yCoordinates.get(i)){
				a = (double)yCoordinates.get(i); 
			}
		}
		return a; 
	}
	public static double LocalMax(ArrayList yCoordinates){
		double a = (double) Collections.min(yCoordinates); 
		for(int i =0; i< yCoordinates.size(); i++){
			if (a < (double)yCoordinates.get(i)){
				a = (double)yCoordinates.get(i); 
			}
		}
		return a; 
	}
		
	public static void main(String[] args){
		ArrayList<Double> yCoordinates = new ArrayList(); 
		yCoordinates.add(10.0);
		yCoordinates.add(5.0);
		yCoordinates.add(7.0);
		double a = LocalMin(yCoordinates); 
		System.out.println(a);
		double b = LocalMax(yCoordinates); 
		System.out.println(b);
	}

}
