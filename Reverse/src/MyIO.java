import java.util.Scanner;

public class MyIO {

	static Scanner myScanner = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String result = myScanner.nextLine();
		return result;
	}
	
	public static double getDouble(String prompt) {
		System.out.print(prompt);
		double result = myScanner.nextDouble();
		return result	;
	}
	
	
}
