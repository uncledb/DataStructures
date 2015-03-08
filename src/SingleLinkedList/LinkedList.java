package SingleLinkedList;

public class LinkedList {

	private Node headNode;

	public LinkedList() {
		Node node3 = new Node(3, null);
		Node node2 = new Node(2, node3);
		this.headNode = new Node(1, node2);
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.getNodeValue(5);
	}

	// 查询
	public int getNodeValue(int index) {
		int a = 0;
		if (index < 1) {
			System.out.println("不能小于1");
			return 0;
		}
		if (index == 1) {
			System.out.println(headNode.getValue());
			return headNode.getValue();
		}

		if (index == 2) {
			System.out.println(headNode.getNextNode().getValue());
			return headNode.getNextNode().getValue();
		}

		if (index > 2) {
			Node nextNode = headNode.getNextNode();
			for (int i = 3; i <= index; i++) {
				nextNode = nextNode.getNextNode();// 第三个元素

				if (nextNode == null) {
					System.out.println("第" + (index) + "个元素不存在");
					return 0;
				}
			}
			System.out.println(nextNode.getValue());
			return nextNode.getValue();
		}
		return a;

	}
}
