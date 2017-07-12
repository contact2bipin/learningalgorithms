import java.util.ArrayList;
import java.util.List;



public class Algo4point3point2MaxTimesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getMaxTimesInArray();
		
	}

	static void getMaxTimesInArray(){
		int[] x = {11,2,23,14,5,6,23,17,8,19,23};
		int length = x.length;
		int max=x[0];
		int j=1;
		int first=-1;
		int last=-1;
		for(int i = 1; i < length; i++)
		{
			if(x[i] == max){
				j=j+1;
				last = i;
			}
			if(x[i] > max){
				max = x[i];
				first = i;
			}
		}
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): Max: " + max);
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): Count: " + j);
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): first: " + first);
		System.out.println("Algo4point1ArrayReverse.arrayReverse(): last: " + last);

	}
}
