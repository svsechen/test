package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("common.Demo");
			Object obj = clazz.newInstance();
			
			Field f = clazz.getField("name");
			f.set(obj, "java");
			
			Method m0 = clazz.getMethod("getName", new Class[0]);
			System.out.println(m0.invoke(obj, new Object[0]).toString());
			
			Method m1 = clazz.getMethod("sayHello", new Class[0]);
			System.out.println(m1.invoke(obj, new Object[0]).toString());
			
			Method m2 = clazz.getMethod("sayHello", new Class[] { String.class });
			System.out.println(m2.invoke(obj, new Object[] { "java world" }).toString());
			
			Method m3 = clazz.getMethod("sayHello", new Class[] { String.class, Date.class });
			System.out.println(m3.invoke(obj, new Object[] { "java world", new Date() }).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}