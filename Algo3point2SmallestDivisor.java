import java.util.ArrayList;
import java.util.List;



public class Algo3point2SmallestDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		smallestDivisor(169);
		
	}

	static void smallestDivisor(int number){
		//number ->
		// if number %2 == 0 -> Smallest divisor is 2
		//iterationSize=Root(number)/2 ->
		//prime = 3 //3,5,7,11,13,17,19 (Find all the prime from 3 to Root(n)/2) generateAllthePrimeNumbers(x)
		//for each(n :prime)
		//	if (number%n==0)
		//	smallestDivsior = number
		
		if (number%2==0){ 
			System.out.println("Algo3point2SmallestDivisor.smallestDivisor is " + 2);
			return;
		}
		if (isPrime(number)){ 
			System.out.println("Algo3point2SmallestDivisor.smallestDivisor is " + number);
			return;
		}
		int iterationSize = ((int)Math.sqrt(number));
		for (int n :  generateAllThePrimeNumbers(iterationSize)) {
			if (number%n==0) {
				System.out
						.println("Algo3point2SmallestDivisor.smallestDivisor is " + n);
				return;
			}
			
		}
		
	}

	
	static List<Integer> generateAllThePrimeNumbers(int number){
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 3; i <= number; i++) {// 1 is not prime, 2 is already taken care of
			if(isPrime(i)){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
		
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if(i==j && i%j==0){
				System.out.println("Algo3point2SmallestDivisor.isPrime(): " + i);
				return true;
			}
			else if(i%j==0){
				return false;
			}
		}
		// TODO Auto-generated method stub
		System.out.println("Algo3point2SmallestDivisor.isPrime(): " + i);
		return true;
	}
}
