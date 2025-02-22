package task24;

import java.util.*;
public class StudentList {

	// Student class implementing Comparable based on name
	class Student implements Comparable<Student> {
	    String name;
	    int age;
	    int rollNumber;

	    public Student(String name, int age, int rollNumber) {
	        this.name = name;
	        this.age = age;
	        this.rollNumber = rollNumber;
	    }

	    // Natural ordering based on name
	    @Override
	    public int compareTo(Student other) {
	        return this.name.compareTo(other.name);
	    }

	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + ", rollNumber=" + rollNumber + "}";
	    }
	}

	// Comparator for sorting by age
	class AgeComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return Integer.compare(s1.age, s2.age);
	    }
	}

	// Comparator for sorting by roll number
	class RollNumberComparator implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return Integer.compare(s1.rollNumber, s2.rollNumber);
	    }
	}

	// Class for even and odd number printing using two threads
	class EvenOddPrinter {
	    private final int limit;
	    private int number = 1;
	    private final Object lock = new Object();

	    public EvenOddPrinter(int limit) {
	        this.limit = limit;
	    }

	    public void printEven() {
	        synchronized (lock) {
	            while (number <= limit) {
	                if (number % 2 == 0) {
	                    System.out.println("Even: " + number);
	                    number++;
	                    lock.notify();
	                } else {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	            }
	        }
	    }

	    public void printOdd() {
	        synchronized (lock) {
	            while (number <= limit) {
	                if (number % 2 != 0) {
	                    System.out.println("Odd: " + number);
	                    number++;
	                    lock.notify();
	                } else {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	            }
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating a list of students
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", 22, 103));
	        students.add(new Student("Bob", 21, 101));
	        students.add(new Student("Charlie", 23, 102));

	        // Sorting using natural ordering (name)
	        Collections.sort(students);
	        System.out.println("Sorted by Name: " + students);

	        // Sorting using AgeComparator
	        Collections.sort(students, new AgeComparator());
	        System.out.println("Sorted by Age: " + students);

	        // Sorting using RollNumberComparator
	        Collections.sort(students, new RollNumberComparator());
	        System.out.println("Sorted by Roll Number: " + students);

	        // Even and Odd number printing using two threads
	        EvenOddPrinter printer = new EvenOddPrinter(10);

	        Thread evenThread = new Thread(printer::printEven);
	        Thread oddThread = new Thread(printer::printOdd);

	        evenThread.start();
	        oddThread.start();
	    }
	}
}
