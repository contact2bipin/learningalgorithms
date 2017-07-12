


public class Algo5point3ExchangeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[] = {20,5,19,7,25,3,11,42,1,21,21};
		for (int i = 0; i < x.length; i++) {
			/**
			 * Here this end is important. 
			 * In every loop of this, we get the last value of the array sorted to its 
			 * correct place and so we subtract it by 1. Also, every time this loops 
			 * starts a fresh it should end at exactly -i--1 times less than actual array length.
			*/
			for (int j = 0; j < x.length-i-1; j++) {
				if (x[j+1]<x[j]) {
					int temp = x[j];
					x[j]=x[j+1];// this is the reason why the end of the loop is subtracted by 1. Else it will throw exception
					x[j+1]=temp;
				}
			}
		}
		
		System.out.println("Algo5point3ExchangeSort.main():");
		for (int i = 0; i < x.length; i++) {
			System.out.print(","+x[i]);
		}
	}

}
