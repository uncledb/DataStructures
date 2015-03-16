package linearlist;

public class TestGaoSi {
	// 计算从1加到100
	public static void main(String[] args) {
		TestGaoSi t = new TestGaoSi();
		t.myTest();
		t.gaoSiTest();
	}

	public void myTest() {
		int i = 1, sum = 0;
		for (; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public void gaoSiTest() {
		int sum = 0, n = 100;
		sum = n * (n + 1) / 2;
		System.out.println(sum);
	}
}
