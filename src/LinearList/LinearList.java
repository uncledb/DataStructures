package LinearList;

public class LinearList {

	int[] ii = new int[10];

	public LinearList() {
		for (int i = 0; i < ii.length; i++) {
			ii[i] = -1;
		}
	}

	public static void main(String[] args) {
		LinearList t = new LinearList();
		t.insertItem(8, 11);
		// t.insertItem(10, 13);
	}

	/**
	 * 查询
	 * 
	 * @param index
	 */
	public void getItem(int index) {
		if (index >= ii.length) {
			System.out.println("没有那么多元素");
		} else {
			System.out.println("getItem(" + index + ")" + ii[index]);
		}
	}

	/**
	 * 插入
	 */
	public void insertItem(int index, int value) {
		int iiLength = ii.length;
		int maxIndex = iiLength - 1;

		if (index < 0) {
			System.out.println("不能小于0");
			return;
		}
		if (index > maxIndex) {
			System.out.println("只能在小于" + iiLength + "的位置插入");
			return;
		}

		if (index == maxIndex) {
			int[] ii2 = new int[iiLength + 1];
			for (int i = 0; i < iiLength; i++) {
				ii2[i] = ii[i];
			}
			ii2[iiLength] = value;
			ii = ii2;
			printII();

		}
		if (index >= 0 && index < maxIndex) {
			int[] ii2 = new int[iiLength + 1];
			for (int i = 0; i < index; i++) {
				ii2[i] = ii[i];
			}
			ii2[index] = value;

			for (int i = index; i < ii.length; i++) {
				ii2[i + 1] = ii[i];
			}
			ii = ii2;
			printII();
		}

	}

	/**
	 * 删除
	 */
	public void deleteItem(int index) {
		if (index >= ii.length) {
			System.out.println("元素下标不存在");
		} else {
		}
	}

	/**
	 * 打印数组（线性表）
	 */
	public void printII() {
		System.out.println("打印中...");
		for (int i = 0; i < ii.length; i++) {
			System.out.print(ii[i]);
			System.out.print(",");
		}
		System.out.println();
	}
}
