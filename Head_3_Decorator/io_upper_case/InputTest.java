package io_upper_case;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = 
				new UpperCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("c://Eclip/Foo2.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
