package Test;

public class TestPage {
	public static void main(String[] args) {
		int allCount = 100; // 实际总数
		int threadCount = 3; // 计划线程数
		int threadSize = allCount / threadCount; // 每个线程实际可以执行的任务数
		System.out.println("threadSize = " + threadSize);
		System.out.println("==============================");
		boolean flag = false;
		if (threadSize > 0) {
			if (allCount % threadCount > 0) {
				flag = true;
				threadCount ++;
			}
			for (int i = 0; i < threadCount; i++) {
				if (flag && i == threadCount -1) {
					System.out.println("current pageIndex = " + i);
					System.out.println("beginIndex = " + i * threadSize);
					System.out.println("current pageSize = " + (allCount - i * threadSize));
					System.out.println("endIndex = " + allCount);
					System.out.println("-----------------------------------");
				} else {
					System.out.println("current pageIndex = " + i);
					System.out.println("beginIndex = " + i * threadSize);
					System.out.println("current pageSize = " + threadSize);
					System.out.println("endIndex = " + (i * threadSize + threadSize));
					System.out.println("-----------------------------------");
				}
			}
		} else {
			System.out.println("current pageSize = " + allCount);
		}
		
	}
}
