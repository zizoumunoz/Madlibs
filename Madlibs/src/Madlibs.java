import java.util.Scanner; 

public class Madlibs {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		String color = "__";
		String verb = "__";
		String adjective = "__";
		String madLib = "The " + color + " dragon " + verb + " at the " + adjective + " knight.";
		
		System.out.println(madLib);
		
		keyScan.close();
	}

}
