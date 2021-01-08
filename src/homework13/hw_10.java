package homework13;

public class hw_10 {

	public static void main(String[] args) {
		try {
			int []a = new int[1000000000];
		} catch(OutOfMemoryError e) {
			System.out.println(e);
		}
		
		
	}

}
