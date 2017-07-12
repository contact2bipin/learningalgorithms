

public class Algo3point1SQRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		squareRoot(64);
	}

	static void squareRoot(double number){
		//n ->36 
		//g1=n/2 ->18
		//g2=n/g1 ->2
		//while(g1-g2<=0.001)
		//	g1=(g1+g2)/2 ->10,6.8,6.047,6.000
		//	g2=n/g1 ->3.6,5.294,5.953,6
		
		double g1 = number/2;
		double g2 =number/g1;
		while((g1-g2)>=0.001){
			g1=(g1+g2)/2;
			g2=number/g1;
		}
		System.out.println("Algo3point1SQRoot.squareRoot():Square root:" + g1);
		
		
	}

}
