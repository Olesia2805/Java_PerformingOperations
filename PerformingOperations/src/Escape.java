
public class Escape {

	public static void main(String[] args) {
		
		float FM_max = 45.6f;
		float FM_min = 15.1f;
		boolean rain = true;
		String result = (rain)? "raining":"clear";
		
		String header = "\n\tBrno weather for 3 days:\n";
		header += "\n\tDay\t\tmax\tmin\trainfall\n";
		header += "\t---\t\t----\t---\t----------\n";
		String forecast = "\tMonday\t\t"+ FM_max +"F\t"+ FM_min +"F\t"+ result +"\n";
		forecast += "\tTuesday\t\t78F\t51F\tclear\n";
		result = (result == "clear") ? "clear":"cloudy";
		forecast += "\tWednesday\t69F\t57F\t"+ result +"\n";
		System.out.print(header + forecast);

	}

}
