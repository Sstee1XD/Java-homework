package homework10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hw11_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer> > rect = new ArrayList<ArrayList<Integer> >();
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();
		int rowMax = -1, colMax = -1;

		Random rand = new Random();
		
		System.out.print("Enter the array size n:");
		int n = in.nextInt();
		
		System.out.println("The random array is");
		for (int i = 1; i <= n; ++i) {
			ArrayList tmp = new ArrayList();
			int sum = 0;
			for (int j = 1; j <= n; ++j) {
				int now = rand.nextInt(2);
				tmp.add(now);
				sum += now;
				System.out.print(now);
				
			}
			System.out.println("");
			rect.add(tmp);
			if (sum > rowMax) {
				rowMax = sum;
				row.clear();
				row.add(i);
			} else if (sum == rowMax) {
				row.add(i);
			}
		}
		
		for (int j = 0; j < n; ++j) {
			int sum = 0;
			for (int i = 0; i < n; ++i) {
				sum += rect.get(i).get(j);
			}
			if (sum > colMax) {
				colMax = sum;
				col.clear();
				col.add(j + 1);
			} else if (sum == colMax) {
				col.add(j + 1);
			}
		}
		
		System.out.print("The largest row index:");
		for (int i = 0; i < row.size(); ++i) {
			System.out.print(row.get(i));
			System.out.print(i < row.size() - 1? "," : "\n");
		}
		
		System.out.print("The largest column index:");
		for (int i = 0; i < col.size(); ++i) {
			System.out.print(col.get(i));
			System.out.print(i < col.size() - 1? "," : "\n");
		}
	}

}
