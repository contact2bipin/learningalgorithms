
public class Algo5point5Pending {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 20, 5, 19, 7, 25, 3, 11, 42, 1, 21, 21 };
		int i; // the number of items sorted so far
		int key; // the item to be inserted
		int j;

		for (i = 1; i < num.length; i++) // Start with 1 (not 0)
		{
			int loc=-1;//Location where the value will be inserted. At every start the default value is -1.
			key = num[i];//num[3]=7
			for (j = i - 1; j >= 0; j--) // Smaller values//j=2
								 		// are moving up
			{
				if(key < num[j]){//7>19//
					num[j + 1] = num[j];//{ 20, 5, 19, 19, 25, 3, 11, 42, 1, 21, 21 }
					loc=j;
				}
			}
			if(loc!=-1)//Set only if loc value is not -1
				num[loc] = key; // Put the key in its proper location
		}
		System.out.println("Algo5point3ExchangeSort.main():");
		for (int ii = 0; ii < num.length; ii++) {
			System.out.print(","+num[ii]);
		}
	}

}
