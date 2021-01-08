package homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class hw11_15 {
	static ArrayList<Double> x = new ArrayList<Double>();
	static ArrayList<Double> y = new ArrayList<Double>();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of the points:");
		int n = in.nextInt();
		System.out.println("Enter the coordinates of the points:");
		for (int i = 1; i <= n; ++i) {
			x.add(in.nextDouble());
			y.add(in.nextDouble());
		}
		
		double ans = 0;
		for (int i = 1; i <= n - 2; ++i) {
			ans += calc(i, i + 1);
		}
		
		System.out.println("The total area is " + ans);
	}
	
	public static double calc(int i, int j) {
		double a = getDis(0, i);
		double b = getDis(0, j);
		double c = getDis(i, j);
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public static double getDis(int i, int j) {
		double tmp = (x.get(i) - x.get(j)) * (x.get(i) - x.get(j));
		tmp += (y.get(i) - y.get(j)) * (y.get(i) - y.get(j));
		return Math.sqrt(tmp);
	}

}

/*
 * -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -13.5
 */
