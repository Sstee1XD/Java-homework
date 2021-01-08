package homework13;

import java.util.Scanner;

public class hw12_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a binary number:");
		String bin = in.nextLine();
		try {
			System.out.println("The decimal value for binary number "
			  + bin + " is " + binaryToDecimal(bin));
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
		
	public static int binaryToDecimal(String bin) throws MyException2 {
		int decimalValue = 0;
		for (int i = 0 ; i < bin.length(); ++i) {
			char binChar = bin.charAt(i);
			decimalValue = decimalValue * 2 + binaryCharToDecimal(binChar);
		}
		
		return decimalValue;
	}
	
	public static int binaryCharToDecimal(char ch) throws MyException2 {
		if (ch >= '0' && ch <= '1')
			return ch - '0';
		else throw new MyException2("NumberFormatException");
	}


}

class MyException2 extends Exception {
	public MyException2(String msg) {
		super(msg);
	}
}
