import java.util.ArrayList;
import java.util.List;



public class Algo3point7XrootNEfficient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Algo3point6XrootNEfficient.main():" + computeXRootN(2, 10));//1024
		
	}


	static int computeXRootN(int x, int n){
		
		if(n == 1){
			return x * x;
		} else{
			if(n % 2 == 1){//odd
				return x * computeXRootN(x, (n-1)/2);
			} else {
				return computeXRootN(x, n/2) * computeXRootN(x, n/2);
			}
		}
	}
}
