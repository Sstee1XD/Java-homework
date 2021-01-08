package homework3;

import java.util.Random;

public class hw3_4 {

	public static void main(String[] args) {
		String month[] = {"", "January", "February", "March", "April", 
				"May", "June", "July", "August", "September",
				"October", "November", "December"};
		Random num = new Random();
		System.out.println(month[num.nextInt(12) + 1]);
	}
	

}
