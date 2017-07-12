import java.util.ArrayList;
import java.util.List;



public class Algo4point1point4Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		arrayArrange();
		
	}

	static void arrayArrange(){
		//int[] x = {1,2,3,4,5,6,7,8,9};
		int[] x = {9,8,2,7,3,6,1,5,4,12};
		int length = x.length;
		//traverse from front
		for(int i = 0; i < length; i++)
		{
			if(x[i] % 2 == 0){//if we find an even from starting - replace it with odd from backwards
				//traverse from backwards
				for (int j = length-1; j >= i; j--) {//Note while traversing backward you need tp traverse from l-1 to i and not to 0
					if(x[j] % 2 == 1){
						int temp = x[i];
						x[i]=x[j];
						x[j]=temp;
						//break;
					}
				}
			}
		}
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): Final Array: ");
		for(int i = 0; i< x.length; i++)// 0 to 4
			System.out.print(x[i] +",");// sort both odd and even separately

	}
}
