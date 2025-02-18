package task21;

public class AverageCalculator {
	public static double calculateAverage(double...numbers) {
		if(numbers.length == 0)
			return 0 ;
		double sum = 0;
		for(double num : numbers) {
			sum += num;
		}
		return sum/numbers.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average : " + calculateAverage(10.5,20.3,21.4));

	}

}
