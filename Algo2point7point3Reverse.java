import javax.lang.model.element.Element;


public class Algo2point7point3Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,5,1,0,5,9};
		createANumberFromArray(arr);
	}

	static void createANumberFromArray(int[] arr){
		
		int finalNum = 0;
		System.out.println("Algo2point7point3Reverse.createANumberFromArray(): "+arr.length);
		for(int i = 0;i<= arr.length-1;i++){
			if (i==arr.length-1)
				finalNum = (finalNum + arr[i]);
			else 
				finalNum = (finalNum + arr[i]) * 10;

		}
		
System.out.println("Algo2point7Reverse.reverse(): finalNum: " + finalNum);
	}

}
