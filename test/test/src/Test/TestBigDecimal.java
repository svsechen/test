package Test;

import java.math.BigDecimal;

public class TestBigDecimal {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("");
		System.out.println(a.intValue() + 8);
		Long b = new Long(1006L);

		System.out.println(isSuccess(1005l));
	}
	private static String isSuccess(Long sta) {
		switch (sta.intValue()) {
		case 1003:
			return "1";
		case 1004:
			return "1";
		case 1005:
			return "1";
		case 1006:
			return "1";
		case 1007:
			return "1";
		default:
			return "0";
		}
	}
}
