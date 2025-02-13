package tast15;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraList = new ArrayList<Integer>();
		arraList.add(10);
		arraList.add(20);
		arraList.add(30);
		arraList.add(10);
		arraList.add(50);
		arraList.add(20);
		
		HashSet<Integer> uniqueNumber = new HashSet<Integer>(arraList);
		
		System.out.println("List After removing duplicate  : "+ uniqueNumber);
		
		
	}

}
