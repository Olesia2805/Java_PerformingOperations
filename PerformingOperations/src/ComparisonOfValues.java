
public class ComparisonOfValues {

	public static void main(String[] args) {
		
		//Strings	
		String txt = "Fantastic ";
		String lang = "Java";
		String txt1 = "Fanta";
		String lang1 = "Javak";
		String txt2 = "Fanta";
		String lang2 = "Fanta";
		
		boolean state = (txt == lang); //checking (txt, lang)
		System.out.println("Checking strings '" + txt + ", " + lang  + "' for equality: " + state);
		state = (txt != lang);
		System.out.println("Checking strings '" + txt + ", " + lang  + "' for inequality: " + state + "\n");
		
		state = (txt1 == lang1); //checking (txt1, lang1)
		System.out.println("Checking strings '" + txt1 + ", " + lang1 + "' for equality: " + state);
		state = (txt1 != lang1);
		System.out.println("Checking strings '" + txt1 + ", " + lang1 + "' for inequality: " + state + "\n");
		
		state = (txt2 == lang2); //checking (txt2, lang2)
		System.out.println("Checking strings '" + txt2 + ", " + lang2 + "' for equality: " + state);
		state = (txt2 != lang2);
		System.out.println("Checking strings '" + txt2 + ", " + lang2 + "' for inequality: " + state);
		System.out.println("-------------------------------------------------------");

		/* incorrect state = (txt2 > lang2); state = (txt2 >= lang2);
							state = (txt2 < lang2); state = (txt2 <= lang2);*/
		
		//numbers variables
		int dozen = 12;
		int score = 20;
		
		state = (dozen > score);
		System.out.println("Checking dozen > score: " + state);
		state = (dozen < score);
		System.out.println("Checking dozen < score: " + state);
		state = (dozen != score);
		System.out.println("Checking dozen != score: " + state);
		state = (dozen == score);
		System.out.println("Checking dozen == score: " + state);
		state = (dozen <= score); //incorrect state = (dozen =< score);
		System.out.println("Checking dozen <= score: " + state);
		System.out.println("-------------------------------------------------------");
		
		//another operation for Strings impossible		
		txt += lang;
		System.out.println("Result of adding " + txt);

		
		
	}

}
