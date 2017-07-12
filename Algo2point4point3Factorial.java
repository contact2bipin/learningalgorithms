import javax.lang.model.element.Element;


public class Algo2point4point3Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double result = checkIfNumberIsfactorial(189.0);
		System.out.println("Algo2point4Sum.main():result: " + result);

	}
	
	static double checkIfNumberIsfactorial(double d){
		if (d == 0)
			return 0.0;

		for (int i = 2; i <= d; i++) {
			d = d / i;
		}
		if(d == 1.0)
			System.out
					.println("Algo2point4point3Factorial.checkIfNumberIsfactorial(): " + true);
		else 
			System.out
					.println("Algo2point4point3Factorial.checkIfNumberIsfactorial()" + false);

		return d;
		
	}

}
