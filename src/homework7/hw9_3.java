package homework7;

import java.util.Date;

public class hw9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		long now = 10000;
		for (int i = 0; i <= 7; ++i) {
			date.setTime(now);
			System.out.println(date.toString());
			now *= 10;
		}
	}

}
