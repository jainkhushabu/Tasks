package task33;

	import java.util.*;
	import java.util.stream.*;

	class Student {
	    String name;
	    int marks;

	    public Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    @Override
	    public String toString() {
	        return name + " (" + marks + ")";
	    }
	}

	public class StreamExample {
	    public static void main(String[] args) {
	        // List of students
	        List<Student> students = Arrays.asList(
	            new Student("Alice", 85),
	            new Student("Bob", 75),
	            new Student("Charlie", 90),
	            new Student("David", 60),
	            new Student("Eve", 95)
	        );

	        // 1. Filter students with marks > 80
	        List<Student> highScorers = students.stream()
	                                            .filter(s -> s.marks > 80)
	                                            .collect(Collectors.toList());
	        System.out.println("Students with marks > 80: " + highScorers);

	        // List of names
	        List<String> names = Arrays.asList("john", "mike", "sarah", "emma");

	        // 2. Convert names to uppercase
	        List<String> upperCaseNames = names.stream()
	                                           .map(String::toUpperCase)
	                                           .collect(Collectors.toList());
	        System.out.println("Uppercase names: " + upperCaseNames);

	        // List of numbers
	        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

	        // 3. Find sum using reduce()
	        int sum = numbers.stream()
	                         .reduce(0, Integer::sum);
	        System.out.println("Sum of numbers: " + sum);
	    }
	}

