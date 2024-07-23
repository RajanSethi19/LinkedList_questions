package LinkedListQuestions;

import java.util.ArrayList;

public class AddColors {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		ar.add("RED");
		ar.add("BLUE");
		ar.add("GREEN");
		ar.add("YELLOW");
		
		System.out.println(ar.indexOf("GREEN"));
		System.out.println(ar);
		
		
		ArrayList ar1= new ArrayList();
		ar1.addAll(ar);
		System.out.println(ar1);
		
		
		
	}

}
