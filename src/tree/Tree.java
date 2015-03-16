package tree;

/**
 * 关于遍历的习题（已知前中 或者 后中 求另一种遍历） 自己总结的解法如下：
 * 
 * 1.根据前序或者后续 得到根结点，再根据中序得到根结点的左右孩子们 
 * 2.递归1，找左孩子的左右孩子们，再找右孩子的左右孩子们
 * 3.根据前序或者后续，与中序的对比，确定到底是左孩子还是右孩子
 * 
 * @author uncle
 * 
 */
public class Tree {
	private Node rootNode = new Node(null, "1", null);

	public static void main(String[] args) {
		Tree t = new Tree();
		System.out.println("前序遍历：");
		t.preOrderTraverse(t.getRootNode());
		System.out.println();
		System.out.println("中序遍历：");
		t.inOrderTraverse(t.getRootNode());
		System.out.println();
		System.out.println("后序遍历：");
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
	 * 前序遍历
	 */
	public void preOrderTraverse(Node node) {
		// 先遍历根节点 然后前序遍历左子树 再前序遍历右子树
		// 前序：先根结点 再左子树 再右子树
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + ",");
		preOrderTraverse(node.getLeftNode());
		preOrderTraverse(node.getRightNode());
	}

	/**
	 * 中序遍历
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
	 * 后序遍历
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
