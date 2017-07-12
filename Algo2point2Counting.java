
public class Algo2point2Counting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] noOfPasses = {23,34,45,56,67,11,77,22,88,33,99}; 
		int noOfPass = noOfPasses(noOfPasses);
		System.out.println("RGDAlgorithm2point2.main(): noOfPasses: "+noOfPass);

	}
	
	static int noOfPasses(int[] studentsMarks){
		
		int count = 0;
		for (int mark : studentsMarks) {
			if(mark>=50){
				count++;
			}
		}
		return count;
		
	}

}
