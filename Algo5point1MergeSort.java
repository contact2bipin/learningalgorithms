


public class Algo5point1MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numArr1 = {15,18,42,52};
		int[] numArr2 = {8,11,16,17,44,58,71,74};
		int[] finalArr = new int[numArr1.length+numArr2.length];
		int k = 0;
		int j = 0;
		for(int i = 0; i < numArr1.length ; i++){
			while( j < numArr2.length) {
				if(numArr1[i] >= numArr2[j]){
					finalArr[k] = numArr2[j];
					k++;
				}else{
					finalArr[k] = numArr1[i];
					k++;
					break;// keep the 'j' as is
				}
				j++;
			}
		}
		
		//copy rest of the remaining numbers
		if(j!=numArr2.length-1){
			for(int i = j; i < numArr2.length ; i++){
				finalArr[k] = numArr2[i];
				k++;
			}
			
		}
		
		System.out.println("Algo4point6KthSmallestPending.main(): ");
		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i]+", ");
		}
	}

}
