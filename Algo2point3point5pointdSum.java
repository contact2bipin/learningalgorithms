
public class Algo2point3point5pointdSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11}; 
		double sum = sum(numbers);
		System.out.println("RGDAlgorithm2point2.main(): sum: "+sum);

	}
	
	static double sum(int[] numbers){
		
		
		double sum = 1.0/numbers[0];
		for (int i = 1; i< numbers.length -1 ;i++) {
			int num = numbers[i];
			sum = sum + (1.0/num);
		}

		return sum;
		
	}

}
