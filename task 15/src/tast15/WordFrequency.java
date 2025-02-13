package tast15;
import java.util.*;
public class WordFrequency {

	public static void main(String[] args) {
		String sentance = "hello my name is ajay";
		String [] words = sentance.split(" ");
		HashMap<String, Integer>  hash = new HashMap<>();
		
		for(String word : words) {
			hash.put(word,hash.getOrDefault(word, 0)+ 1 );
		}
		
		System.out.println("Frequency os word is : "+ hash);
	}

}
