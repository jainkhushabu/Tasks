package tast15;
import java.util.*;
public class HashMapDetail {

	public static void main(String[] args) {
			HashMap<Integer, String> hash = new HashMap<>();
			hash.put(101, "Ajay");
			hash.put(102, "Khushi");
			hash.put(103, "Ritesh");
			hash.put(104, "Bhushan");
			hash.put(105, "Vivek");
			
			System.out.println(" Student Detail (Roll no -> Name) : " + hash);
			
			System.out.println("retrieve student with roll no 102  : " + hash.get(102));

	}

}
