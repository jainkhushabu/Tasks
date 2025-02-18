package task17;


import java.util.PriorityQueue;
import java.util.Comparator;

	class Patient {
	    String name;
	    int severity; // Lower values mean higher priority (1 = most urgent)

	    public Patient(String name, int severity) {
	        this.name = name;
	        this.severity = severity;
	    }

	    @Override
	    public String toString() {
	        return "Patient{name='" + name + "', severity=" + severity + "}";
	    }
	}

	public class EmergencyQueue {
	    public static void main(String[] args) {
	        // Priority Queue with custom comparator for patient severity
	        PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));

	        // Adding patients to the queue
	        queue.add(new Patient("Alice", 3));  // Mild case
	        queue.add(new Patient("Bob", 1));    // Most urgent
	        queue.add(new Patient("Charlie", 2)); // Medium severity
	        queue.add(new Patient("David", 5));  // Least urgent

	        System.out.println("Processing patients in order of emergency:");
	        while (!queue.isEmpty()) {
	            System.out.println(queue.poll()); // Poll removes and returns the highest priority patient
	        }
	    }
	}


