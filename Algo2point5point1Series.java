

public class Algo2point5point1Series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sum(5);

	}
	
	static void sum(int n){

		int fact = 1;//0!
		int sum = 1;// for 0!
		
		// for other n! - 0!
		for (int i = 1; i <= n; i++) {
			fact= fact * i;
			sum = sum + fact;
		}
			System.out
					.println("Algo2point4point3Factorial.sum(): sum: " + sum);
	
	}

}
