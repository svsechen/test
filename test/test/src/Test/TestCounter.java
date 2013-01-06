package Test;

public class TestCounter {
	public static void main(String[] args) {
		while (true) {
			System.out.println("current = " + System.currentTimeMillis());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
