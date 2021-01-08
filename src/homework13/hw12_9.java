package homework13;

import java.util.Scanner;

public class hw12_9 {

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
		
	public static int binaryToDecimal(String bin) throws MyException4 {
		int decimalValue = 0;
		for (int i = 0 ; i < bin.length(); ++i) {
			char binChar = bin.charAt(i);
			decimalValue = decimalValue * 2 + binaryCharToDecimal(binChar);
		}
		
		return decimalValue;
	}
	
	public static int binaryCharToDecimal(char ch) throws MyException4 {
		bin2Dec(ch);
		return ch - '0';
	}
	
	public static void bin2Dec(char ch) throws MyException4 {
		if (ch < '0' || ch > '1') throw new MyException4("NumberFormatException");
	}


}

class MyException4 extends Exception {
	public MyException4(String msg) {
		super(msg);
	}
}
