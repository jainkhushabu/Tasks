package task22;

    import java.util.ArrayList;
	import java.util.Iterator;

	public class IteratorExample {
	    public static void main(String[] args) {
	        // Create an ArrayList of student names
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Ajay");
	        students.add("Rahul");
	        students.add("Amit");
	        students.add("Suresh");
	        students.add("Anil");

	        // Using Iterator to print all student names
	        System.out.println("Student List:");
	        Iterator<String> iterator = students.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // Removing a student whose name starts with "A"
	        iterator = students.iterator();
	        while (iterator.hasNext()) {
	            String name = iterator.next();
	            if (name.startsWith("A")) {
	                iterator.remove();
	            }
	        }

	        // Printing the updated student list
	        System.out.println("\nUpdated Student List (after removing names starting with 'A'):");
	        for (String student : students) {
	            System.out.println(student);
	        }
	    }
	}



