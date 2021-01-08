package homework13;

import java.util.Scanner;

public class hw12_8 {

	public static void main(String[] args) throws  MyException3 {
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
	
	public static int hexToDecimal(String hex) throws  MyException3 {
		int decimalValue = 0;
		for (int i = 0 ; i < hex.length(); ++i) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) throws  MyException3 {
		hex2Dec(ch);
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
	
	public static void hex2Dec(char ch) throws MyException3 {
		if ((ch < 'A' || ch > 'F') && (ch < '0' || ch > '9')) throw new MyException3("HexFormatException");
	}

}

class  MyException3 extends Exception {
	public  MyException3(String msg) {
		super(msg);
	}
}
