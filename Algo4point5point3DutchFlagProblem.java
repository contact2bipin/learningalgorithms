import java.util.ArrayList;
import java.util.List;



public class Algo4point5point3DutchFlagProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		partitionArray(15);
		
	}

	static void partitionArray(int n){
		int[] x = {2,3,2,3,1,1,3,2,3,1,1,2,3,2,1,2,3,2,1,3,2,1,1,3,3};//R,W,B={1,2,3}
		int length = x.length;
		//Arrange in order of R,W,B
		//tranverse from front
		for(int i = 0; i < length; i++)
		{
			if(x[i] == 3){//{Starting can never be B(3)}
				//traverse backwards
				for (int j = x.length-1; j >i; j--) {//Note while traversing backward you need tp traverse from l-1 to i and not to 0
					if(x[j]==1){//{Ending can never be R(1)}
						int temp = x[j]; 
						x[j]=x[i];
						x[i]=temp;
						break;
					}
				}
			}
		}
		// After this all the 1s will be before all the 3s. All the 2s will still be at their posiotions.
		System.out.println("Algo4point5PartitionArray: Array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("| " + x[i]);
		}

		for(int i = 0; i < length; i++)
		{
			if(x[i] == 2){//{Starting can never be W(2)}
				//traverse backwards
				for (int j = x.length-1; j >i; j--) {//Note while traversing backward you need tp traverse from l-1 to i and not to 0
					if(x[j]==1){//{Middle can never be R(1)}
						int temp = x[j]; 
						x[j]=x[i];
						x[i]=temp;
						break;
					}
				}
			}
		}
		// After this all the 1s will be before all the 3s. All the 2s will still be at their posiotions.
		System.out.println("\nAlgo4point5PartitionArray: Array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("| " + x[i]);
		}

		for(int i = 0; i < length; i++)
		{
			if(x[i] == 3){//{Middle can never be W(3)}
				//traverse backwards
				for (int j = x.length-1; j >i; j--) {//Note while traversing backward you need tp traverse from l-1 to i and not to 0
					if(x[j]==2){//{Ending can never be R(2)}
						int temp = x[j]; 
						x[j]=x[i];
						x[i]=temp;
						break;
					}
				}
			}
		}
		// After this all the 1s will be before all the 3s. All the 2s will still be at their posiotions.
		System.out.println("\nAlgo4point5PartitionArray: Array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("| " + x[i]);
		}
	}
}
