
public class Arithmetic {

	public static void main(String[] args) {
		
		//Numbers
		
		int num = 100;
		int factor = 20;
		float sum = 0; /*double - more accurate value
							more digits after the decimal point*/
		float a = 84.6f;
		
		sum = num + factor; //100+20
		System.out.println("Result of adding " + sum);
		
		sum = num - factor; //100-20
		System.out.println("Result of subtraction " + sum);
		
		sum = num * factor; //100*20
		System.out.println("Result of multiplication " + sum);
		
		sum = num / factor; //100/20
		System.out.println("Result of division " + sum);
		
		System.out.println("-------------------------------------");
		
		sum += a; /*(previous result 
						was written in this box) => 5 + 84.6*/
		System.out.println("Result of adding " + sum);
		
		sum *= a; /*(previous result 
						was written in this box) => 89.6 * 84.6*/
		System.out.println("Result of multiplication " + sum);
		
		sum -= a; // 7580.1597 - 84.6
		System.out.println("Result of subtraction " + sum);
		
		sum /= a; // 7495.5596 / 84.6
		System.out.println("Result of division " + sum);

	}

}
