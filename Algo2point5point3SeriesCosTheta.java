

public class Algo2point5point3SeriesCosTheta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sum(2,5);//cos 2 --- series till 5

	}
	
	static void cox(float x, int n){
		// cos x = x - x^2/2! + x^4/4! - x^6/6!.....
		// (((-1)^n)*(x^2n))/((2n)!)
		
		}
	static void sum(int x, int n){

		double sum = 1;// for n = 0
		
		// for other n! - 0!
		for (int i = 1; i <= n; i++) {
			double a = Math.pow(-1, i);
			double b = Math.pow(x, 2*i);
			float c = fact(2*i);
			sum = (double) (sum + ((a)*1.0*(b))/(c));
		}
			System.out
					.println("Algo2point4point3Factorial.sum(): sum: " + sum);
	
	}
	
	
	static float fact(int num){
		float fact = 1;//0! for n=0;
		for (int i = 1; i <= num; i++) {
			fact = fact* i;
		}
		return fact;
	}

}
