package task32;
    import java.util.function.*;
	import java.util.stream.Collectors;

	class Person {
	    String name;

	    Person(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	public class LambdaExample {
	    public static void main(String[] args) {
	        // 1. Filter out numbers greater than 10 using Predicate<Integer>
	        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3, 10, 15);
	        Predicate<Integer> isLessThanOrEqualTo10 = num -> num <= 10;
	        List<Integer> filteredNumbers = numbers.stream()
	                                               .filter(isLessThanOrEqualTo10)
	                                               .collect(Collectors.toList());
	        System.out.println("Filtered numbers (<=10): " + filteredNumbers);

	        // 2. Convert each string to uppercase using Function<String, String>
	        List<String> words = Arrays.asList("hello", "world", "java", "lambda");
	        Function<String, String> toUpperCase = String::toUpperCase;
	        List<String> upperCaseWords = words.stream()
	                                           .map(toUpperCase)
	                                           .collect(Collectors.toList());
	        System.out.println("Uppercase words: " + upperCaseWords);

	        // 3. Print each string in uppercase using Consumer<String>
	        Consumer<String> printUpperCase = word -> System.out.println(word.toUpperCase());
	        words.forEach(printUpperCase);

	        // 4. Sort a list of Person objects based on the second character of their names
	        List<Person> people = Arrays.asList(
	            new Person("Alice"),
	            new Person("Bob"),
	            new Person("Charlie"),
	            new Person("David")
	        );

	        Comparator<Person> sortBySecondChar = Comparator.comparing(p -> p.getName().charAt(1));
	        Collections.sort(people, sortBySecondChar);

	        System.out.println("Sorted persons by second character of name:");
	        for (Person p : people) {
	            System.out.println(p.getName());
	        }
	    }
	}


