package homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class hw11_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter ten integers:");
		for (int i = 1; i <= 10; ++i) {
			int t = in.nextInt();
			list.add(t);
		}
		removeDuplicate(list);
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		System.out.print("The distinct integers are");
		if (list.size() == 0) return;
		
		System.out.print(" " + list.get(0));
		
		for (int i = 1; i < list.size(); ++i) {
			for (int j = 0; j < i; ++j) {
				if (list.get(j) == list.get(i)) break;
				if (j == i - 1) {
					System.out.print(" " + list.get(i));
				}
			}
		}
		
	}
}
