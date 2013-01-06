package common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "hello";
	}
	
	public String sayHello(String name) {
		return name + ", hello";
	}
	
	public String sayHello(String name, Date date) {
		return name + ", hello at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}

	public Demo() {
		super();
	}

	public Demo(String name) {
		super();
		this.name = name;
	}
	
}
