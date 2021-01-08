package homework14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class hw_14 {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(new File("src/homework14/input.txt"));
			out = new FileOutputStream(new File("src/homework14/output.txt"));
			
			int bufferSize = 10;
			byte[] buffer = new byte[bufferSize];
			int len;
			
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
