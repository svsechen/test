package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestFileSplit {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\temp\\moneysch.txt\\")));
			int index = 0;
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("c:/address/address_" + index + ".txt")));
			int num = 0;
			//int indexCount = 0;
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				//indexCount++;
				//if (indexCount <= 50000000)
				//	continue;
				pw.println(str);
				if (num >= 50000000 && num % 50000000 == 0) {
					pw.flush();
					index++;
					pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("d:/address/address_" + index + ".txt")));
				}
				num++;
			}
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
