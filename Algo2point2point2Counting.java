
public class Algo2point2point2Counting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] listOfNos = {-23,34,-45,56,67,-11,77,0,0,0,-22,88,-33,99}; 
		getPositiveNegativeNumbers(listOfNos);

	}
	
	static void getPositiveNegativeNumbers(int[] listOfNos){
		
		int positiveNumberCount = 0;
		int negativeNumberCount = 0;
		for (int number : listOfNos) {
			if(number > 0){
				positiveNumberCount++;
			} else if (number < 0) {
				negativeNumberCount++;
			}
		}
		
		System.out.println("RGDAlgorithm2point2point3.main(): positiveNumberCount : "+positiveNumberCount );
		System.out.println("RGDAlgorithm2point2point3.main(): negativeNumberCount : "+negativeNumberCount );
	}

}
