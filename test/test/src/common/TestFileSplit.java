package common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestFileSplit {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/temp/person.txt"), "UTF-8"));
			int index = 0;
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("d:/temp/person_" + index + ".txt"),"UTF-8"));
			int num = 0;
			int cache = 10000;
			String str = null;
			while ((str = br.readLine()) != null) {
				pw.println(str);
				if (num >= 50000000 && num % 50000000 == 0) {
					pw.flush();
					index++;
					pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("d:/temp/person_" + index + ".txt"),"UTF-8"));
				}
				num++;
			}
			pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
