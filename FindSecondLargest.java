package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		//Declaring the list
		List<Integer> li = new ArrayList<>(data.length);
		
		//Looping and adding array in to the list
		for (Integer data1 : data) {
			li.add(data1);
		}
		//Sorting the list & Reverse sort the list
		Collections.sort(li);
		Collections.reverse(li);	
		//Printing the second largest number in the list
		System.out.println("Second largest in the given array is "+li.get(1));
	}
}
