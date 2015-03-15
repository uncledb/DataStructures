package tree;

/**
 * ���ڱ�����ϰ�⣨��֪ǰ�� ���� ���� ����һ�ֱ����� �Լ��ܽ�Ľⷨ���£�
 * 
 * 1.����ǰ����ߺ��� �õ�����㣬�ٸ�������õ����������Һ����� 
 * 2.�ݹ�1�������ӵ����Һ����ǣ������Һ��ӵ����Һ�����
 * 3.����ǰ����ߺ�����������ĶԱȣ�ȷ�����������ӻ����Һ���
 * 
 * @author uncle
 * 
 */
public class Tree {
	private Node rootNode = new Node(null, "1", null);

	public static void main(String[] args) {
		Tree t = new Tree();
		System.out.println("ǰ�������");
		t.preOrderTraverse(t.getRootNode());
		System.out.println();
		System.out.println("���������");
		t.inOrderTraverse(t.getRootNode());
		System.out.println();
		System.out.println("���������");
		t.postOrderPrint(t.getRootNode());
	}

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public Tree() {
		Node node8 = new Node(null, "8", null);
		Node node7 = new Node(null, "7", null);
		Node node6 = new Node(null, "6", null);
		Node node5 = new Node(null, "5", null);
		Node node4 = new Node(node8, "4", null);
		Node node3 = new Node(node6, "3", node7);
		Node node2 = new Node(node4, "2", node5);
		this.rootNode = new Node(node2, "1", node3);
	}

	/**
	 * ǰ�����
	 */
	public void preOrderTraverse(Node node) {
		// �ȱ������ڵ� Ȼ��ǰ����������� ��ǰ�����������
		// ǰ���ȸ���� �������� ��������
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + ",");
		preOrderTraverse(node.getLeftNode());
		preOrderTraverse(node.getRightNode());
	}

	/**
	 * �������
	 */
	public void inOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraverse(node.getLeftNode());
		System.out.print(node.getData() + ",");
		inOrderTraverse(node.getRightNode());
	}

	/**
	 * �������
	 */
	public void postOrderPrint(Node node) {
		if (node == null) {
			return;
		}
		postOrderPrint(node.getLeftNode());
		postOrderPrint(node.getRightNode());
		System.out.print(node.getData() + ",");
	}
}
