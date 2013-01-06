package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -3);
		c.getTime();
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(new SimpleDateFormat("yyyy-MM").format(c.getTime()));
		
		Calendar d = Calendar.getInstance();
		try {
			d.setTime(new SimpleDateFormat("yyyy-MM").parse("2012-03"));
			d.add(Calendar.MONTH, -6);
			System.out.println(new SimpleDateFormat("yyyy年MM月").format(d.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
