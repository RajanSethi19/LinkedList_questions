package LinkedListQuestions;

import java.util.LinkedList;

public class RemoveElementFromTop {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();

		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		l1.add("six");
		l1.add("seven");
		System.out.println(l1);

		if (l1.contains("GREEN")) {

			System.out.println("ELEMENT PRESENT");
		}

		else {

			System.out.println("ELEMENT NOT PRESENT");
		}
		// System.out.println(" Removed Elemet " + l1.pollFirst());
		// System.out.println(" Retrive Elemet " + l1.element());
		// System.out.println(l1);

	}

}
