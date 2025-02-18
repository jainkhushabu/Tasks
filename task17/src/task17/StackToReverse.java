package task17;
import java.util.Stack;


public class StackToReverse {

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Push characters onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        
        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}
	


