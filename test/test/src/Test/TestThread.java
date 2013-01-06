package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("static-access")
public class TestThread {
	public static void main(String[] args) {
		Thread m = new Thread(new MainThread());
		System.out.println("MainThread start at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		m.start();
		
		while (true) {
			if (m.interrupted()) {
				System.out.println("MainThread restart at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				m = new Thread(new MainThread());
				m.start();
			}
		}
	}
}

@SuppressWarnings("static-access")
class MainThread implements Runnable {
	@Override
	public void run() {
		Thread t1 = new Thread(new MyThread(), "t1");
		t1.start();
		
		Thread t2 = new Thread(new MyThread(), "t2");
		t2.start();
		
		Thread t3 = new Thread(new MyThread(), "t3");
		t3.start();
		
		if (t1.interrupted() && t2.interrupted() && t3.interrupted()) {
			System.out.println("ttttttttttttttttttttttttttttt");
			Thread.currentThread().interrupt();
		}
	}
}

@SuppressWarnings("static-access")
class MyThread implements Runnable {
	@Override
	public void run() {
		boolean flag = true;
		int c = 0;
		while(flag) {
			c ++;
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " c = " + c);
			if (c == 10) {
				flag = false;
				Thread.currentThread().interrupt();
			}
		}
	}
}

class TimerThread implements Runnable {
	@Override
	public void run() {
		long l = System.currentTimeMillis() + 1000 * 10;
		while (true) {
			if (l == System.currentTimeMillis()) {
				System.out.println(">>>>>>>>>>>>>>>> system stop at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				System.exit(0);
			}
		}
	}
}
