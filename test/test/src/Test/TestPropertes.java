package Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestPropertes {
	public static void main(String[] args) {
		InputStream is = TestPropertes.class.getResourceAsStream("/test.properties");
		Properties p = new Properties();
		try {
			p.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p.getProperty("test"));
		System.out.println(p.get("test"));
		String path = p.getProperty("test");
		File f = new File(path + "test.txt");
		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
	}
}
