package Test;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		FileTest("dd");
	}
	public static void FileTest(String temp) {
		File file = new File(temp);
		System.out.println(file.isDirectory());
	}
}
