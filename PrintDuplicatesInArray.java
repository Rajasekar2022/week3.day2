package week3.day2;

import org.testng.annotations.IFactoryAnnotation;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		// get the length of the array
		int length = arr.length;
		// declare an int variable named count
		int count;
		
		for (int i = 0; i < length-1; i++) {
			count=0;
			for (int j = i+1; j < length-1; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}	
			}
			if(count >0) {
				System.out.println("Duplicate value in the array "+ arr[i]);
			}
		}
	}
}
