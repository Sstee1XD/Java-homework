package homework7;

import java.util.Scanner;

public class hw9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a, b, c, d, e, f;
		System.out.print("Enter a, b, c, d, e, f: ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = in.nextDouble();
		e = in.nextDouble();
		f = in.nextDouble();
		LinearEquation lequa = new LinearEquation(a, b, c, d, e, f);
		
		if (lequa.isSolvable() == false) {
			System.out.println("The equation has no solution.");
		} else {
			System.out.println("x is " + lequa.getX() + " and y is " + lequa.getY());
		}
	}

	public static class LinearEquation{
		private double a, b, c, d, e, f;
		
		public LinearEquation() {
		}
		
		public LinearEquation(double a, double b, double c, double d, double e, double f) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		}
		
		public boolean isSolvable() {
			return this.a * this.d - this.b * this.c != 0;
		}
		
		public double getX() {
			double a = this.a, b = this.b, c = this.c, d = this.d, e = this.e, f = this.f;
			return (e * d - b * f) / (a * d - b * c);
		}
		
		public double getY() {
			double a = this.a, b = this.b, c = this.c, d = this.d, e = this.e, f = this.f;
			return (a * f - e * c) / (a * d - b * c);
		}
	}
}
