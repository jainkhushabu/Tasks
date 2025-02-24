package task23;

 import java.util.*;
 public class Sorting{


	class Student implements Comparable<Student> {
	    String firstName;
	    String lastName;
	    int age;
	    double height;

	    // Constructor
	    public Student(String firstName, String lastName, int age, double height) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.height = height;
	    }

	    // Natural ordering: Sort by age
	    @Override
	    public int compareTo(Student other) {
	        return Integer.compare(this.age, other.age);
	    }

	    // Custom toString() for better output representation
	    @Override
	    public String toString() {
	        return firstName + " " + lastName + " (Age: " + age + ", Height: " + height + ")";
	    }
	}

	// Custom Comparator to sort by the 2nd character of firstName
	class SecondCharacterComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        if (s1.firstName.length() < 2 || s2.firstName.length() < 2) {
	            return 0; // Handle edge cases where firstName has less than 2 characters
	        }
	        return Character.compare(s1.firstName.charAt(1), s2.firstName.charAt(1));
	    }
	}

	// Main class to test sorting
	
	public class StudentSortingDemo {
	    public static void main(String[] args) {
	        // Sample list of students
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", "Brown", 22, 5.4));
	        students.add(new Student("Bob", "Smith", 20, 5.7));
	        students.add(new Student("Charlie", "Davis", 24, 5.9));
	        students.add(new Student("David", "White", 21, 5.8));

	        // Sorting by natural order (age)
	        Collections.sort(students);
	        System.out.println("Sorted by Age (Natural Order):");
	        for (Student s : students) {
	            System.out.println(s);
	        }

	        // Sorting by the 2nd character of firstName
	        students.sort(new SecondCharacterComparator());
	        System.out.println("\nSorted by 2nd Character of FirstName:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}
 }

