package resource.tree;

/**
 * ���Ľ����
 * @author Administrator
 *
 */
public class Node {
	public Node lchild;
	public Node rchild;
	public int data;
	
	public Node(int data){
		this.lchild = null;
		this.rchild = null;
		this.data = data;
	}
}
