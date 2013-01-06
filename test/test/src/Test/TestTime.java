package Test;

public class TestTime {
	public static void main(String[] args) {
		Long t = System.currentTimeMillis();
		Long n = 0L;
		while (true) {
			n = System.currentTimeMillis();
			System.out.println((System.currentTimeMillis() - t) / 1000);
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void doTask() {
		System.out.println("ddddddddd");
	}
}
