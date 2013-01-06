package Test;

public class Page {	
	public static void main(String[] args) {
		threadTask(29, 5, null);
	}
	
	public static void threadTask(int allCount, int pageSize,  Thread thread) {
		boolean flag = false;
		int pageCount = 0;
		if (allCount > pageSize) {
			pageCount = allCount / pageSize;
			int r = allCount % pageSize;
			if (r > 0) {
				pageCount ++;
				flag = true;
			}
			System.out.println(pageCount);
			for (int i = 0; i < pageCount; i++) {
				if (flag && i == pageCount -1) {
					System.out.println("current pageIndex = " + i);
					System.out.println("beginIndex = " + i * pageSize);
					System.out.println("current pageSize = " + (allCount - i * pageSize));
					System.out.println("endIndex = " + allCount);
					System.out.println("-----------------------------------");
				} else {
					System.out.println("current pageIndex = " + i);
					System.out.println("beginIndex = " + i * pageSize);
					System.out.println("current pageSize = " + pageSize);
					System.out.println("endIndex = " + (i * pageSize + pageSize));
					System.out.println("-----------------------------------");
				}
			}
		} else {
			System.out.println("current pageSize = " + allCount);
		}
	}
}
