package tast15;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("MAngo");		
		arrayList.add("Grephs");
		
		System.out.println("ArrayList Element are : "+ arrayList);
		arrayList.get(1);
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Elefant");
		linkedList.add("Lion");
		linkedList.add("Tiger");
		linkedList.add("Dog");
		
		System.out.println("Linked List Element are : "+ linkedList);
		linkedList.get(1);
		


		
	}

}
