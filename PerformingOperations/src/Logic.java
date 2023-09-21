
public class Logic {

	public static void main(String[] args) {
		
		boolean yes = true;
		boolean no = false;
		
		System.out.println("Result yes AND yes: " + (yes && yes) );
		System.out.println("Result yes AND no: " + (yes && no) );
		System.out.println("Result no AND no: " + (no && no) );
		System.out.println("---------------------------------------");
		System.out.println("Result yes OR yes: " + (yes || yes) );
		System.out.println("Result yes OR no: " + (yes || no) );
		System.out.println("Result no OR no: " + (no || no) );
		System.out.println("---------------------------------------");
		System.out.println("The initial value of the yes: " + yes);
		System.out.println("Inverted variable yes: " + !yes);
		System.out.println("The initial value of the no: " + no);
		System.out.println("Inverted variable no: " + !no);
		
	}

}
