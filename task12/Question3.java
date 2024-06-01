package task12;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Question3 {

	public static void main(String[] args) {
		
		TreeMap< String,Integer> map = new TreeMap<>();
		map.put( "Kani",101);
		map.put( "Manto",103);
		map.put("Ana",102 );
		map.put("Banu", 104);
		
		for(Entry<String ,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey());
			
	
		}
		
	}

}
