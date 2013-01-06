package Test;

import java.math.BigDecimal;


public class Test1 {
	private static final String[] REPORTTYPE = { "00", "01", "02" };
	private static final String[] PAYCODE = { "00", "01", "02", "03" };
	public static void main(String[] args) {
/*		for (int i = 0; i < REPORTTYPE.length; i++) {
			for (int j = 0; j < PAYCODE.length; j++) {
			    System.out.println("[报表类型:" + REPORTTYPE[i] + ", 缴费频率:" + PAYCODE[j] + "]");
			}
		}*/
		double d = 13669558.690000D;
		System.out.println(String.valueOf(d));
		System.out.println(new BigDecimal(d).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
	}
}
