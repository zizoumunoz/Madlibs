import java.util.Scanner; 

public class Madlibs {

	public static void main(String[] args) {
		// makes a new Scanner called 'keyScan'
		Scanner keyScan = new Scanner(System.in);
		
		String color = "__";
		String verb = "__";
		String adjective = "__";
		
		// composes the madLib template
		String madLib = "The " + color + " dragon " + verb + " at the " + adjective + " knight.";
		
		// prints the mad lib template
		System.out.println(madLib);
		
		// asks user for a color, past tense verb, and an adjective to put in the madlib
		System.out.println("Enter a color:");
		color = keyScan.nextLine();
		System.out.println("Enter a past tense verb");
		verb = keyScan.nextLine();
		System.out.println("Enter an adjective");
		adjective = keyScan.nextLine();
		
		// composes the madlib again
		madLib = "The " + color + " dragon " + verb + " at the " + adjective + " knight.";
		
		// prints madlib
		System.out.println(madLib);
		
		// closes scanner
		keyScan.close();
	}

}
