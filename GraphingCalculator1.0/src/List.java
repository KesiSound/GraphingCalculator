import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
	//List object that stores a list of ints
	//This class allows you to create a list by passing through an arraylist of Doubles
	//Covers all the edit functions found on TI84
	private ArrayList<Double> yourList = new ArrayList<Double>();
	
	//Constructor for making List object - takes an arraylist of integers that will be given through the GUI
	public List(ArrayList<Double> yourList) {
		this.yourList = yourList;
	}
	
	//Sorts your data in ascending order
	public void sortListAscending() {
		Collections.sort(yourList);
	}
	
	//Sorts your data in descending order
	public void sortListDescending() {
		Collections.sort(yourList, Collections.reverseOrder());
	}
	
	//Clears your arraylist - size will be 0, makes all values null
	public void clearList() {
		yourList.clear();
	}
	
	public ArrayList<Double> getArrayList() {
		return yourList;
	}
	/* I messed up and made functions for arrays, should have used arrayList
	public void sortListAscending(int[] yourList) {
		Arrays.sort(yourList);
		this.yourList = yourList;
	}
	
	public void sortListDescending(int[] yourList) {
		Arrays.sort(yourList);
		int descendingCounter = yourList.length-1;
		for (int i = 0; i < yourList.length; i++) {
			int firstNum = yourList[i];
			int lastNum = yourList[descendingCounter];
			yourList[i] = lastNum;
			yourList[descendingCounter] = firstNum;
		}
		this.yourList = yourList;
	}
	
	public void clearList(int[] yourList) {
		for (int i = 0; i < yourList.length; i++) {
			yourList[i] = 0;
		}
	}
	*/
}
