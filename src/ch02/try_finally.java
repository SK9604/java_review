package ch02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class try_finally {
	static String firstLineOfFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}
}
