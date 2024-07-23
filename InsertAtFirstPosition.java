package LinkedListQuestions;

import java.util.LinkedList;

public class InsertAtFirstPosition {

	public static void main(String[] args) {
		LinkedList <String> l= new LinkedList();
		l.add("Rajan");
		l.add("Meenu");
		l.add("Rajat");
		l.add("Aaarika");
		l.add("Mummy");
		l.add("papa");
		System.out.println("ORIGINAL ARRAY" + l );
		
		l.add("SACHIN");
		l.add("VIRAT");
		System.out.println("ADDING NEW ARRAY LIST" + l );
		
	}

}
