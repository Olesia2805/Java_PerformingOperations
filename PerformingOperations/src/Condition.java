
public class Condition {

	public static void main(String[] args) {
		
		//(Boolean-expression) ? if-true: if-false;
		int num1 = 1357;
		int num2 = 2468;
		int num3 = 579;
		int num4 = 498;
		String result, status; //for storage checking result
		boolean busted;
		
		//division without remainder "%" for any numbers (not only %2)
		result = (num1 % 2 != 0) ? "odd" : "even"; 
		System.out.println(num1 + " - " + result);
		result = (num2 % 2 != 0) ? "odd" : "even";
		System.out.println(num2 + " - " + result);
		result = (num3 % 2 == 0) ? "even" : "odd";
		System.out.println(num3 + " - " + result);
		result = (num4 % 2 == 0) ? "even" : "odd";
		System.out.println(num4 + " - " + result + "\n");
		
		busted = (num3 > num2) ? true : false;
		System.out.println(num3 +" > "+ num2 + " = " + busted);
		status = (busted) ? "ready": "process..."; //busted == true => default
		System.out.println(status);
		busted = (num4 <= num1) ? true : false;
		System.out.println(num4 +" <= "+ num1 + " = " + busted);
		status = (busted) ? "ready": "process..."; // busted == true => default
		System.out.println(status);
		

	}

}
