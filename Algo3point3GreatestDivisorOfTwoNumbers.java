import java.util.ArrayList;
import java.util.List;



public class Algo3point3GreatestDivisorOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		greatestDivisorOfTwoNumbers(491, 631);
		
	}

	static void greatestDivisorOfTwoNumbers(int n1, int n2){
		//n1, n2 -> 30, 18
		// if (n1 > n2)
		//	 grtNum = n1
		//	 lsNum = n2
		// else 
		// 	 grtNum = n2
		//	 lsNum = n1
		//
		// 
		//while(grtNum % lsNum != 0)
		//	temp = grtNum
		//  grtNum = lsNum
		// 	lsNum = grtNum % lsNum
		//
		//if(grtNum % lsNum == 0)
		//	greatestDivisorOfTwoNumbers = lsNum
		// 
		int grtNum = 0;
		int lsNum = 0;

		if(n1 > n2){
			grtNum = n1;
			lsNum = n2;
		} else {
			grtNum = n2;
			lsNum = n1;
		}

		int temp;
		while(lsNum != 0 && grtNum % lsNum != 0){
			temp = grtNum; 
			grtNum = lsNum;
			lsNum = temp % lsNum;
			if(lsNum == 0)
				break;
		}
		if(lsNum != 0 && grtNum % lsNum == 0){
			System.out.println("Algo3point3GreatestDivisorOfTwoNumbers.greatestDivisorOfTwoNumbers(): " + lsNum);
		}
		else
			System.out.println("Algo3point3GreatestDivisorOfTwoNumbers. There is NO greatestDivisorOfTwoNumbers: ");
	}
}
