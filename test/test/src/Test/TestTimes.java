package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTimes {
	public static void main(String[] args) {
		String str = null;
		if (str.equals("aaa")) {
			System.out.println("dd");
		}
	}

	private static void getDate() {
		String df = new SimpleDateFormat("yyMMdd").format(new Date());
		System.out.println(df + "L");
	}
	
	private static String getNumStr(int num) {
		String numstr = String.valueOf(num);
		int len = String.valueOf(num).length();
		switch (len) {
		case 1:
			return "000" + num;
		case 2:
			return "00" + num;
		case 3:
			return "0" + num;
		case 4:
			return numstr;
		default :
			return null;
		}
	}
	
}
