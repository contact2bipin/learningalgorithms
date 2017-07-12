import javax.lang.model.element.Element;


public class Algo2point6Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fibonacci(20);
	}
	
	static void  fibonacci(int number){
		if (number < 2){ 
			System.out.println("Algo2point6Fibonacci.fibonacci(): Enter value more than equal to 2");
			return;
		}
		
		long[] arr = new long[number];
		arr[0]=0;
		arr[1]=1;

		for (int i = 2; i < number; i++) {
			arr[i] = arr[i - 1] + arr[i - 2]; 
		}
		System.out.println("Algo2point6Fibonacci.fibonacci(): arr[i]: ");
		for (int i = 0; i < number; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
