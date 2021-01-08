package homework3;

import java.util.Scanner;

public class hw3_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the three edges of the triangle seprated by spaces: ");
		int e1 = in.nextInt();
		int e2 = in.nextInt();
		int e3 = in.nextInt();
		
		if (e1 + e2 > e3 && e1 + e3 > e2 && e2 + e3 > e1) {
			System.out.println("The perimeter of the triangle is: " + (e1 + e2 + e3));
		}
		else System.out.println("Your input is illegal!");
	}

}
