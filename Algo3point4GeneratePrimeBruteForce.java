import java.util.ArrayList;
import java.util.List;



public class Algo3point4GeneratePrimeBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		generateAllThePrimeNumbers(100);
		
	}

	static List<Integer> generateAllThePrimeNumbers(int number){
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 2; i <= number; i++) {// 1 is not prime
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
