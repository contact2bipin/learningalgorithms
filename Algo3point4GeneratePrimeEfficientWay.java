import java.util.ArrayList;
import java.util.List;



public class Algo3point4GeneratePrimeEfficientWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		generateAllThePrimeNumbers(100);
		
	}

	/**
	 * 2<= x < 9            2
	 * 9<= x < 25           2,3
	 * 25<= x < 49          2,3,5
	 * 49<= x < 121         2,3,5,7
	 * @param number
	 */
	static void generateAllThePrimeNumbers(int number){
		
		
		
		
		List<Integer> setOfNumbers = new ArrayList<Integer>();//Assume default -> 1 to 100
		for (int i = 2; i < number; i++) {
			setOfNumbers.add(i);
		}
		// 1 is not prime || Prime upto Root(n) i.e we need to find all the primes from 2 to Root(n)
		// here it is 2,3,5,7 i.e. all prime between 2 to Root(100) i.e. 2 to 10.
		for (int i = 2; i < Math.sqrt(number); i++) {
			if(isPrime(i)){
				// remove all the numbers from 3 to 100 which are divisible by i [i=2,3,5,7,9,...
				for (int j = 0; j < setOfNumbers.size(); j++) {// 1 is not prime - setOfNumbers.get(0)=1
					if(i!=setOfNumbers.get(j) && setOfNumbers.get(j) % i == 0){
						setOfNumbers.remove(j);
					}
				}
			}
		}
		System.out.println("Algo3point4GeneratePrimeBruteForce.generateAllThePrimeNumbers();setOfNumbers:" + setOfNumbers);
		
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
