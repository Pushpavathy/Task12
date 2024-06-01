package task12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		ArrayList<String> value = new ArrayList<>();
		value.add("Kani");
		value.add("Manto");
		value.add("Thigazh");
		value.add("Navee");
		System.out.println(value);
		
	Iterator<String> itr = value.iterator();
	while(itr.hasNext())
	{
		System.out.println("The values are" +  itr.next());
	}
		
	value.removeAll(value);
	
	System.out.println(value);
		

	}

}
