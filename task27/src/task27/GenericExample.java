package task27;
	
	class Pair<T, U> {
	    private T first;
	    private U second;

	    // Constructor
	    public Pair(T first, U second) {
	        this.first = first;
	        this.second = second;
	    }

	    // Getter and Setter methods
	    public T getFirst() {
	        return first;
	    }

	    public void setFirst(T first) {
	        this.first = first;
	    }

	    public U getSecond() {
	        return second;
	    }

	    public void setSecond(U second) {
	        this.second = second;
	    }

	    @Override
	    public String toString() {
	        return "(" + first + ", " + second + ")";
	    }
	}

	// Generic Swap Method
	class SwapUtil {
	    public static <T> void swap(T[] arr, int i, int j) {
	        T temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}

	// Generic Method to Find Maximum of Three Numbers
	class MaxUtil {
	    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
	        T max = a; 
	        if (b.compareTo(max) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        return max;
	    }
	}

	// Main Class
	public class GenericExample {
	    public static void main(String[] args) {
	        // Testing Pair Class
	        Pair<Integer, String> pair = new Pair<>(1, "Hello");
	        System.out.println("Pair: " + pair);
	        
	        pair.setFirst(2);
	        pair.setSecond("World");
	        System.out.println("Updated Pair: " + pair);
	        
	        // Testing Swap Method
	        Integer[] numbers = {10, 20};
	        System.out.println("Before Swap: " + numbers[0] + ", " + numbers[1]);
	        SwapUtil.swap(numbers, 0, 1);
	        System.out.println("After Swap: " + numbers[0] + ", " + numbers[1]);
	        
	        // Testing Find Max Method
	        System.out.println("Max of (3, 7, 5): " + MaxUtil.findMax(3, 7, 5));
	        System.out.println("Max of (2.5, 7.2, 5.1): " + MaxUtil.findMax(2.5, 7.2, 5.1));
	        System.out.println("Max of (Apple, Orange, Banana): " + MaxUtil.findMax("Apple", "Orange", "Banana"));
	    }
	}


