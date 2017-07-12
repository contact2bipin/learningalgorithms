import javax.lang.model.element.Element;


public class Algo2point7Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverse(204578);
	}

	static void reverse(int number){
		int revNum=0;
		while(true){
			int mod = number % 10;//8
			number = number / 10; //20457 - integer division
			revNum = revNum * 10 + mod;
			if(number == 0) break;
		}
System.out.println("Algo2point7Reverse.reverse(): reverse: " + revNum);
	}

}
