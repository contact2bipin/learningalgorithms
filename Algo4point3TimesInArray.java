import java.util.ArrayList;
import java.util.List;



public class Algo4point3TimesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getMaxInArray();
		
	}

	static void getMaxInArray(){
		int[] x = {11,2,23,14,5,6,17,8,19};
		int length = x.length;
		int max=x[0];
		for(int i = 1; i < length; i++)
		{
			if(x[i] > max){
				max = x[i];
			}
		}
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): Max: " + max);

	}
}
