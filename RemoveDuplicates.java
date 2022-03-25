package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words	
		 */

		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String string = " ";

		List <String> lis = new ArrayList<>();

		for (String str1 : text.split(" ")) {
			lis.add(str1);
		}		
		for (int i = 0; i < lis.size(); i++) {
			for (int j = i+1; j < lis.size(); j++) {
				if (lis.get(i).equals(lis.get(j))) {
					count++;
					lis.set(i, " ");
				}	
			}
		}
		while (lis.contains(" ")) {
			lis.remove(" ");
			count--;
		}
		for (String string2 : lis) {
			string = string+string2+" ";			
		}
		System.out.println("Initial string with duplicates: "+ text);
		System.out.println("String after removing duplicates: "+string);
	}
}
