import java.util.ArrayList;
import java.util.List;



public class Algo4point5PartitionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		partitionArray(15);
		
	}

	static void partitionArray(int n){
		int[] x = {11,20,2,21,14,5,6,17,8,19,23,8};
		int length = x.length;
		//tranverse from front
		for(int i = 0; i < length; i++)
		{
			if(x[i] > n){
				//traverse backwards
				for (int j = x.length-1; j >i; j--) {//Note while traversing backward you need tp traverse from l-1 to i and not to 0
					if(x[j]<=n){
						int temp = x[j]; 
						x[j]=x[i];
						x[i]=temp;
						break;
					}
				}
			}
		}
		System.out.println("Algo4point5PartitionArray: Array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("| " + x[i]);
		}

	}
}
