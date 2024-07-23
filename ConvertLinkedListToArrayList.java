package LinkedListQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add("CAR");
		l.add("BIKE");
		l.add("JEEP");
		l.add("XUV");
		l.add("CYCLE");
		l.add("TRUCK");
		
		List<String> list= new ArrayList<String>(l);
		
		for(String s:list) {
			
			System.out.println(s);
		}
		
	}

}
