import java.util.ArrayList;
import java.util.List;



public class Algo3point5PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		computePrimeFactors(100);
		
	}

	/**
	 * double n
	 * int i=2;
	 * list
	 * while(n - (int)n > 0)
	 *  	if(n % i==0)
	 * 			list.add(i)
	 * 			n = n/i
	 * 		else
	 * 			i++;
	 * 
	 *  
	 * @param number
	 */
	static void computePrimeFactors(double number){
		int[] prime = {2,3,5,7,11,13,17,19,23,29,31};
		for (int p : prime) {
			while(number % p == 0){ //100/2
				System.out.println("Algo3point5PrimeFactors.computePrimeFactors(): " + p);
				number = number / p;
				
			}
		}
	}
}
