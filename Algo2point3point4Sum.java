
public class Algo2point3point4Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {23,34,45,56,67,11,77,22,88,33,99}; 
		double hmean = hmean(numbers);
		System.out.println("RGDAlgorithm2point2.main(): hmean: "+hmean);

	}
	
	static double hmean(int[] numbers){
		
		
		double sum = 1.0/numbers[0];
		for (int i = 1; i< numbers.length -1 ;i++) {
			int num = numbers[i];
			sum = sum + (1/num);
		}
		double hmean = numbers.length/sum;
		return hmean;
		
	}

}
