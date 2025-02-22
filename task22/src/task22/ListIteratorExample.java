package task22;

    import java.util.LinkedList;
	import java.util.ListIterator;

	public class ListIteratorExample {
	    public static void main(String[] args) {
	        // Create a LinkedList of city names
	        LinkedList<String> cities = new LinkedList<>();
	        cities.add("Mumbai");
	        cities.add("Delhi");
	        cities.add("Bangalore");
	        cities.add("Hyderabad");
	        cities.add("Chennai");

	        // Using ListIterator to traverse forward
	        System.out.println("Cities in forward order:");
	        ListIterator<String> listIterator = cities.listIterator();
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }

	        // Using ListIterator to traverse backward
	        System.out.println("\nCities in reverse order:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	    }
	}



