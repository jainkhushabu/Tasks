package task26;
	
	import java.util.LinkedList;
	import java.util.Queue;

	class Library {
	    private final Queue<Integer> books = new LinkedList<>();
	    private final int capacity;

	    public Library(int capacity) {
	        this.capacity = capacity;
	        for (int i = 1; i <= capacity; i++) {
	            books.add(i); // Adding books with IDs 1, 2, ..., capacity
	        }
	    }

	    public synchronized int borrowBook(String studentName) {
	        while (books.isEmpty()) {
	            System.out.println(studentName + " is waiting for a book...");
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	        int book = books.poll();
	        System.out.println(studentName + " borrowed Book " + book);
	        return book;
	    }

	    public synchronized void returnBook(int book, String studentName) {
	        books.add(book);
	        System.out.println(studentName + " returned Book " + book);
	        notify(); // Notify a waiting thread that a book is available
	    }
	}

	class Student extends Thread {
	    private final Library library;
	    private final String studentName;

	    public Student(Library library, String studentName) {
	        this.library = library;
	        this.studentName = studentName;
	    }

	    @Override
	    public void run() {
	        int borrowedBook = library.borrowBook(studentName);
	        try {
	            Thread.sleep((long) (Math.random() * 3000)); // Simulate reading time
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        library.returnBook(borrowedBook, studentName);
	    }
	}

	public class LibraryManagementSystem {
	    public static void main(String[] args) {
	        Library library = new Library(3); // Library with 3 books

	        // Creating student threads
	        Student s1 = new Student(library, "Student 1");
	        Student s2 = new Student(library, "Student 2");
	        Student s3 = new Student(library, "Student 3");
	        Student s4 = new Student(library, "Student 4");
	        Student s5 = new Student(library, "Student 5");

	        // Start student threads
	        s1.start();
	        s2.start();
	        s3.start();
	        s4.start();
	        s5.start();
	    }
	}


