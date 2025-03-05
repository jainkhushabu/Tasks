package task31;

public class EvenNumberChecker {
	
	    public static void main(String[] args) {
	        // Create a Runnable using a Lambda Expression
	        Runnable evenCheck = () -> {
	            System.out.println("Even numbers from 1 to 20:");
	            for (int i = 1; i <= 20; i++) {
	                if (i % 2 == 0) {
	                    System.out.print(i + " ");
	                }
	            }
	        };

	        // Create a Thread and start it
	        Thread thread = new Thread(evenCheck);
	        thread.start();
	    }
	}


