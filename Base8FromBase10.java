import java.util.ArrayList;
import java.util.List;


public class Base8FromBase10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		convertToBase8FromBase10(275);
	}

	static void convertToBase8FromBase10(int number){
		List<Integer> l = new ArrayList<Integer>();//3,2,4
		List<Integer> l2 = new ArrayList<Integer>();
		while(number != 0){
			int remainder = number % 8;
			number = number / 8; //Quotient becomes the number
			l.add(remainder);
		}
		int sum = 0;
		for (int i = l.size()-1; i >= 0; i--) {
			if (i == 0)
				sum = (sum + l.get(i));//(0+4)*10
			else
				sum = (sum + l.get(i))*10;//(0+4)*10
		}
		System.out.println("Algo2point7Reverse.reverse(): list: " + l.toString());
		System.out.println("Algo2point7Reverse.reverse(): sum: " + sum);
	}

}
