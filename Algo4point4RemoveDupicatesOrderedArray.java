import java.util.ArrayList;
import java.util.List;



public class Algo4point4RemoveDupicatesOrderedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getMaxInArray();
		
	}

	static void getMaxInArray(){
		int[] x = {2,2,8,8,15,23,23,23,23,26,29,32,32};//ordered array
		int length = x.length;
		int j= 1;
		for(int i = 1; i < length; i++)
		{
			if(x[i] != x[i-1]){
				x[j] = x[i];
				j++;
			}
		}
		System.out.println("Algo4point5RemoveDupicatesOrderedArray:");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+", ");
			
		}

	}
}
