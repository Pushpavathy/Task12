package task12;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> fromList = new ArrayList<Integer>();
		
		fromList.add(101);
		fromList.add(102);
		fromList.add(103);
		fromList.add(104);
		
		System.out.println(fromList);
		Object[] arr = fromList.toArray();
		
		for(Object a : arr)
		{
			System.out.println(a);
		}
		

	}

}
