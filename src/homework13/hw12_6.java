package homework13;

import java.util.Scanner;

public class hw12_6 {

	public static void main(String[] args) throws MyException1 {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a hex number:");
		String hex = in.nextLine();
		try {
			System.out.println("The decimal value for hex number "
			  + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static int hexToDecimal(String hex) throws MyException1 {
		int decimalValue = 0;
		for (int i = 0 ; i < hex.length(); ++i) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) throws MyException1 {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')
			return ch - '0';
		else throw new MyException1("NumberFormatException");
	}

}

class MyException1 extends Exception {
	public MyException1(String msg) {
		super(msg);
	}
}
