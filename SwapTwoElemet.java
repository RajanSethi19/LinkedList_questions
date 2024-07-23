package LinkedListQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElemet {

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
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.swap(l1, 0, 3);
		System.out.println(l1);
		
		

	}

}
