package tree;

public class Node {
	private Node leftNode;
	private Node rightNode;
	private String data;

	public Node(Node l, String d, Node r) {
		this.leftNode = l;
		this.rightNode = r;
		this.data = d;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
