
public class Algo2point2point3Counting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] noOfPasses = {23,34,45,56,67,11,77,22,88,33,99,87,33,76}; 
		int noOfPass1 = noOfPasses1(noOfPasses);
		int noOfPass2 = noOfPasses2(noOfPasses);
		System.out.println("RGDAlgorithm2point2.main(): noOfPasses1: "+noOfPass1);
		System.out.println("RGDAlgorithm2point2.main(): noOfPasses2: "+noOfPass2);

	}
	
	static int noOfPasses1(int[] studentsMarks){
		
		int count = 0;
		for (int mark : studentsMarks) {
			if(mark>=50){
				count++;
			}
		}
		return count;
		
	}

	static int noOfPasses2(int[] studentsMarks){
		
		int count = studentsMarks.length;
		for (int mark : studentsMarks) {
			if(mark<50){
				count--;
			}
		}
		return count;
		
	}

}
