package LinkedListQuestions;

import java.util.LinkedList;

public class CompareTwoLinkedLists {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList();
		l.add("Rajan");
		l.add("Meenu");
		l.add("Rajat");
		l.add("Aaarika");
		l.add("Mummy");
		l.add("papa");

		LinkedList<String> l1 = new LinkedList();

		l1.add("Meenu");
		l1.add("Rajat");
		l1.add("Aaarika");
		l1.add("Mummy");
		l1.add("papa");

		LinkedList<String> c = new LinkedList<String>();

		for (String s : l) {
			
			c.add(l1.contains(s) ? "YES" :"NO");

		}
		System.out.println(c);
	}

}
