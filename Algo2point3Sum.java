
public class Algo2point3Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {23,34,45,56,67,11,77,22,88,33,99}; 
		int sum = sum(numbers);
		System.out.println("RGDAlgorithm2point2.main(): sum: "+sum);

	}
	
	static int sum(int[] numbers){
		
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;
		
	}

}
