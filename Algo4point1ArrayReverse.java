import java.util.ArrayList;
import java.util.List;



public class Algo4point1ArrayReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		arrayReverse();
		
	}

/**
 * 
x = {1,2,3,4,5,6,7,8,9}

for(int i = 0; i< x/2; i++)// 0 to 4
	y = x[i]
	x[i]=x[x.length]
	x[x.length] = y

 * @param x
 * @param n
 * @return
 */
	static void arrayReverse(){
		int[] x = {1,2,3,4,5,6,7,8,9,0}; // array index from 0 to length - 1

		System.out.println("Algo4point1ArrayReverse.arrayReverse(): Array: " + x);
		for(int i = 0; i< x.length/2; i++)// 0 to 4
		{
			int y = x[i];
			x[i]=x[x.length-(i+1)];
			x[x.length-(i+1)] = y;
		}
		for(int i = 0; i< x.length; i++)// 0 to 4
			System.out.println("Algo4point1ArrayReverse.arrayReverse(): Reverse Array: " + x[i]);
	}
}
