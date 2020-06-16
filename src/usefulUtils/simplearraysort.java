package usefulUtils;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class simplearraysort {
	protected static Set<Integer> integerset;
	public static void main(String[] args) {
		
		int[] simplearray = null;
		simplearray = new int[]{1, 3, 7, 9, 7, 3, 4};
		findNumsWithDuplicates(simplearray);
	}
	
	public static Set<Integer> findNumsWithDuplicates(int[] arrayReceived) {
		//store array length in variable:
		int arraylength = arrayReceived.length;
		//Initialize set of integers class variable:
		integerset = new HashSet<Integer>();
		//Test Nesting Loops:
		for (int i = arrayReceived[0]; i < arraylength; i++) {
			//Reveal all elements of the array first loop
			//System.out.println("loop 1 Element of array at i = " + arrayReceived[i]);
		
			for(int y = i+1; y< arraylength; y++) {
				//Reveal all contents of the nested loop
				//System.out.println("loop 2 Element of array at y = " + arrayReceived[y]);
				
				//Check one number against all subsequent numbers
				if(arrayReceived[i] == arrayReceived[y]) {
					integerset.add(arrayReceived[i]);
				}
			}
		}
		System.out.println(integerset);
		return integerset;
	}
	
	
}
