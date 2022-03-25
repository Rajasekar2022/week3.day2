package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		//Declaring the list
		List<Integer> list = new ArrayList<>();
		//Looping and adding array in to the list
		for (Integer arr1 : arr) {
			list.add(arr1);
		}
		//Sorting the list
		Collections.sort(list);
		System.out.println(list);
		//Looping and finding the missing element
		for (int i = 0; i < list.size(); i++) {
			if (i+1!=list.get(i)) {
				System.out.println("Missing element in the array "+(i+1));
				break;
			}		
		}
	}
}