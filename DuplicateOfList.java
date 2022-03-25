package week3.day2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hpsf.Array;

public class DuplicateOfList {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("Adam");
		name.add("Ben");
		name.add("Zara");
		name.add("Adam");
		name.add("Charlie");
		name.add("James");
		name.add("Ben");

		//		System.out.println(name);
		String arr[];

		for (int i = 0; i < name.size(); i++) {
			for (int j = i+1; j < name.size(); j++) {
				if(name.get(i)==name.get(j)) {
					System.out.println("Duplicate value: "+name.get(i));
				}

			}

		}

	}

}
