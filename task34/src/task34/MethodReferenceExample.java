package task34;

import java.util.function.Function;

//Step 1: Convert Lambda to Method Reference
public class MethodReferenceExample {
 public static void main(String[] args) {
     // Lambda Expression
     Function<String, Integer> lambdaExp = str -> str.length();
     System.out.println("Lambda Expression Result: " + lambdaExp.apply("Hello"));

     // Method Reference
     Function<String, Integer> methodRef = String::length;
     System.out.println("Method Reference Result: " + methodRef.apply("Hello"));

     // Step 2: Using an Interface with a Default Method
     MyClass obj = new MyClass();
     obj.show(); // Overridden method
     obj.defaultMethod(); // Default method from the interface
 }
}

//Step 2: Create an Interface with a Default Method
interface MyInterface {
 // Default method
 default void defaultMethod() {
     System.out.println("This is the default method in the interface.");
 }

 // Abstract method (needs to be overridden)
 void show();
}

//Step 2: Implement and Override the Interface in a Class
class MyClass implements MyInterface {
 @Override
 public void show() {
     System.out.println("Overridden show() method in MyClass.");
 }
}



