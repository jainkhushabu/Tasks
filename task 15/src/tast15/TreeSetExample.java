package tast15;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(21);
		treeSet.add(32);
		treeSet.add(12);
		treeSet.add(67);
		
		System.out.println("TreeSet Sorted order : "+ treeSet);

	}

}
