

public class Algo2point5point2Series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sum(10);

	}
	
	static void sum(double n){

		double fact = 1.0;//0!
		double sum = 1.0;// for 1/0!
		
		// for other 1/n! - 1/0!
		for (int i = 1; i <= n; i++) {
			fact= fact * i;
			sum = sum + 1.0/fact;
		}
			System.out.println("Algo2podouble4podouble3Factorial.sum(): sum: " + sum);
	
	}

}
