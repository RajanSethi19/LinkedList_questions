package LinkedListQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IterateAllElement {

	public static void main(String[] args) {
		LinkedList <String> l= new LinkedList <String>();
		l.add("Rajan");
		l.add("Meenu");
		l.add("Rajat");
		l.add("Aaarika");
		l.add("Mummy");
		l.add("papa");
		
		
		for(String s: l) {
			
			System.out.println(s);
		}
		
	}

}
