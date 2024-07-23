package LinkedListQuestions;

import java.util.LinkedList;

public class PositionInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList();
		l.add("Rajan");
		l.add("Meenu");
		l.add("Rajat");
		l.add("Aaarika");
		l.add("Mummy");
		l.add("papa");
		System.out.println(l);
	l.removeFirst();
	l.removeLast();
	
		
		System.out.println(l);
		

		for (int i = 0; i < l.size(); i++) {

			System.out.println("Index is  " + i + " and valuse is " + l.get(i));
		}

	}

}
