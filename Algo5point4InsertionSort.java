
public class Algo5point4InsertionSort {

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
			key = num[i];//store the element as key to be inserted
			int loc=i;//store the location of this key 
			for (j = i - 1; j >= 0; j--) // Smaller values//j=2
								 		// are moving up
			{
				if(key < num[j]){//7>19//
					num[j + 1] = num[j];//{ 20, 5, 19, 19, 25, 3, 11, 42, 1, 21, 21 }
					loc=j;//set the new location for the key
				}
			}
			if(loc!=i)//If the location for the key has changed to new location 
				num[loc] = key; // Put the key in this new location
		}
		System.out.println("Algo5point3ExchangeSort.main():");
		for (int ii = 0; ii < num.length; ii++) {
			System.out.print(","+num[ii]);
		}
	}

}
