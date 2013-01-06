package common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestReadFile {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/temp/person.txt")));
			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
