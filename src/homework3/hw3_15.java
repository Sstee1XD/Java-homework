package homework3;

import java.util.Random;
import java.util.Scanner;

public class hw3_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random num = new Random();
		
		int i;
		int has[] = new int[10];
		for (i = 0; i <= 9; ++i) has[i] = 0;
		int lottery = num.nextInt(900) + 100;
		int tmp = lottery;
		while (tmp != 0) {
			has[tmp % 10] ++;
			tmp /= 10;
		}
		
		System.out.print("Enter a three-digit integer: ");
		int myLottery = in.nextInt();
		
		System.out.print("You won $");
		int price = 0;
		if (myLottery == lottery) {
			price = 10000;
		}
		else {
			while(myLottery != 0) {
				if (has[myLottery % 10] > 0) {
					has[myLottery % 10] --;
					price += 1000;
				}
				myLottery /= 10;
			}
		}
		System.out.println(price);
	}

}
