
public class Precedene {

	public static void main(String[] args) {
		
		int sum = 39 - 4 + 7 * 9;
		System.out.println("The default procedure is: " + sum);
		sum = (39 - 4 + 7) * 9;
		System.out.println("Procedure indicated: " + sum);
		sum = (39 - (4 + 7)) * 9;
		System.out.println("Specific procedure: "+ sum);
		System.out.println("------------------------------");
		
		boolean result = true;
		boolean notResult = false;
		int num1 = 5;
		int num2 = 10;
		String status;
		
		//first third second fourth
		status = (result != notResult && num1 != num2) ? "good" : "bad" ;
		System.out.println(status);
		//second third first fourth
		status = (result == notResult || num1 >= num2) ? "good" : "bad" ;
		System.out.println(status);
		System.out.println("------------------------------");
		
		//(&& has higher priority than ||)
		/*		  fifth		  	sixth   	 seventh
		   (first (&&)  second  (&&)  third)  (||)  (fourth)*/
		// incorrect || correct
		status = (num1 == num2 && result != notResult && num1 != num2 || result != notResult) ? "good" : "bad" ;
		System.out.println(status);
		/*		 sixth  	  seventh  	  	fifth 
		   first (&&)  second  (&&)  third  (||)  (fourth)*/
		// incorrect && correct && correct
		status = (num1 == num2 && result != notResult && (num1 != num2 || result != notResult)) ? "good" : "bad" ;
		System.out.println(status);
		System.out.println("------------------------------");
		
		/*		  seventh 		 fifth	      sixth
		   (first) (||) (second) (&&) (third) (&&) (fourth)*/
		// correct || (incorrect && correct && incorrect)
		status = (num1 != num2 || result == notResult && result != notResult && num1 == num2) ? "good" : "bad" ;
		System.out.println(status);
		/*		   third 		   sixth 	    seventh
		   ((first) (||) (second)) (&&) (fourth) (&&) (fifth)*/
		// correct && correct && incorrect
		status = ((num1 != num2 || result == notResult) && result == notResult && num1 == num2) ? "good" : "bad" ;
		System.out.println(status);
		
	}

}
