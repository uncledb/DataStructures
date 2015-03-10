package SingleLinkedList;

/**
 * 假设头结点数据域有意义
 * 
 * @author uncle
 * 
 */
public class LinkedList {
	// Test
	public static void main(String[] args) {
		LinkedList list = new LinkedList(false, 10);
		list.printList();
		list.deleteAll();
	}

	private Node headNode = new Node(1, null);

	/**
	 * 是否是头插入 这里用构造器代替insertAll
	 * 
	 * @param isHeadInsert
	 */
	public LinkedList(boolean isHeadInsert, int size) {
		this.headNode = new Node(1, null);
		Node node = new Node(2, null);
		this.headNode.setNextNode(node);
		for (int i = 3; i <= size; i++) {
			if (isHeadInsert) {
				insert(2, i);
			} else {
				insert(size() + 1, i);
			}
		}
		System.out
				.println("====================创建完成============================");
	}

	/**
	 * 删除所有
	 */
	public void deleteAll() {
		for (int i = 1, size = size(); i <= size; i++) {
			delete(size + 1 - i);
		}
		printList();
	}

	/**
	 * 删除 先获取后 在由前指向后
	 * 
	 * @param index
	 */
	public void delete(int index) {
		int size = size();
		Node nodei = null;
		if (index > size || index < 0) {
			System.out.println("对不起，您要删除的索引，这个真没有 ");
		} else {
			if (size == 1) {
				System.out.println("就剩一个元素了'表'删了~求可怜");
				return;
			} else {
				if (index == 1) {
					headNode = headNode.getNextNode();
				} else if (index == size) {
					Node node_i = getNode(index - 1);
					node_i.setNextNode(null);
				} else {
					nodei = getNode(index);
					if (nodei != null) {
						Node nodeiNext = nodei.getNextNode();
						Node node_i = getNode(index - 1);
						node_i.setNextNode(nodeiNext);
						printList();
					} else {
						System.out.println("查询写的应该有问题");
					}
				}
			}
		}
		printList();

	}

	/**
	 * 插入 先接后 再接前
	 * 
	 * @param index
	 * @param nextNode
	 */
	public void insert(int index, int value) {
		int size = size();
		if (index < 1) {
			System.out.println("不能小于1");
		} else if (index == 1) {
			// 头位置
			Node newHead = new Node(value, headNode);
			headNode = newHead;
		} else if (index > 1 && index <= size) {
			// 中间位置插入
			Node insertNode = new Node(value, null);
			Node nodei = getNode(index);
			insertNode.setNextNode(nodei);
			Node ides1 = getNode(index - 1);
			ides1.setNextNode(insertNode);
		} else if (index >= (size + 1)) {
			// 末尾位置
			if (index > size + 1) {
				System.out.println("你输入的位置很远，所以给您插在了最后一位");
				index = size + 1;
			}
			Node insertNode = new Node(value, null);
			Node lastNode = getNode(size);
			lastNode.setNextNode(insertNode);

		} else {
			System.out.println("插入时 有没有考虑到的情况");
		}
		printList();

	}

	/**
	 * 查询
	 */
	public Node getNode(int index) {
		System.out.print("查询结果：");
		Node node = null;
		if (index < 1) {
			System.out.println("不能小于1");
			return node;
		}
		if (index == 1) {
			System.out.println(headNode.getValue());
			return headNode;
		}

		if (index == 2) {
			System.out.println(headNode.getNextNode().getValue());
			return headNode.getNextNode();
		}

		if (index > 2) {
			Node nextNode = headNode.getNextNode();
			for (int i = 3; i <= index; i++) {
				nextNode = nextNode.getNextNode();// 第三个元素

				if (nextNode == null) {
					System.out.println("第" + (index) + "个元素不存在");
					return node;
				}
			}
			System.out.println(nextNode.getValue());
			node = nextNode;
		}
		return node;
	}

	/**
	 * 输出List
	 */
	public void printList() {
		System.out.print("打印结果:");
		Node nextNode = headNode.getNextNode();
		System.out.print(headNode.getValue());
		while (nextNode != null) {
			System.out.print("," + nextNode.getValue());
			nextNode = nextNode.getNextNode();
		}
		System.out.println();
	}

	/**
	 * 返回size大小
	 * 
	 * @return
	 */
	public int size() {
		int size = 1;
		if (headNode.getNextNode() == null) {
			return size;
		}
		Node nextNode = headNode.getNextNode();
		while (nextNode != null) {
			nextNode = nextNode.getNextNode();
			size++;
		}
		return size;
	}
}
