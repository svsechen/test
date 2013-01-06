package reflect;

import java.util.Date;
import common.Demo;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("common.Demo");
			Demo demo = (Demo) clazz.newInstance();
			demo.setName("java reflect");
			System.out.println(demo.getName());
			System.out.println(demo.sayHello());
			System.out.println(demo.sayHello("java world"));
			System.out.println(demo.sayHello("java world", new Date()));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
