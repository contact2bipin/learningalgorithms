import javax.lang.model.element.Element;


public class Algo2point4Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("Algo2point4Sum.main():result: " + result);

	}
	
	static int factorial(int number){
		int factorial = 1;
		if (number == 0)
			return factorial;

		for (int i = 0; i < number-1; i++) {
			factorial = number * factorial(number-1);
		}
		return factorial;
		
	}

}
