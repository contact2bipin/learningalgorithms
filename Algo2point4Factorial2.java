import javax.lang.model.element.Element;


public class Algo2point4Factorial2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = factorial(0);
		System.out.println("Algo2point4Sum.main():result: " + result);

	}
	
	static int factorial(int number){
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = i * factorial;
		}
		return factorial;
		
	}

}
