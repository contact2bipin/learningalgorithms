


public class Algo5point2SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[] = {20,5,19,7,25,3,11,42,1,21,21};
		int minLoc = 0;

		for (int i = 0; i < x.length; i++) {
			int min=x[i];//assume this is minimum value
			minLoc=i;//assume this is minimum location
			for (int j = i+1; j < x.length; j++) {// look for minimum in rest of the array
				if (x[j]<min) {
					min = x[j];//this is actual minimum value, so set it
					minLoc=j;//this is actual minimum value location, so set it
				}
			}
			//then exchange the assumed once with the actuals and move the assumed value to the place where min was residing
			int temp = x[i];
			x[i]=min;
			x[minLoc]=temp;
			
		}
		
		
		System.out.println("Algo5point2SelectionSort.main()");
		for (int i = 0; i < x.length; i++) {
			System.out.print(","+x[i]);
		}
	}

}
