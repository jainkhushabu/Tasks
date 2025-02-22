package task22;


	import java.util.Vector;
	import java.util.Enumeration;

	public class EnumerationExample {
	    public static void main(String[] args) {
	        // Create a Vector of country names
	        Vector<String> countries = new Vector<>();
	        countries.add("India");
	        countries.add("USA");
	        countries.add("Canada");
	        countries.add("Australia");
	        countries.add("Germany");

	        // Using Enumeration to print all country names
	        System.out.println("Country List:");
	        Enumeration<String> enumeration = countries.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	    }
	}



