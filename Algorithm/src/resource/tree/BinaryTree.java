package resource.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import resource.tree.Node;
public class BinaryTree {

	/**�������Ĺ����Լ������������������������������α���
	 * @param args
	 */
	public static void main(String[] args) {
		int[] datas = {1,2,3,4,5,6,7};	
		BinaryTree bt = new BinaryTree();
		Node root = bt.createBinaryTree(datas);
		System.out.println("root: "+root.data);
		System.out.println("���������");
		bt.preOrder(root);
		System.out.println();
		System.out.println("���������");
		bt.inOrder(root);
		System.out.println();
		System.out.println("���������");
		bt.postOrder(root);
		System.out.println();
		System.out.println("��α�����");
		bt.levelOrder(root);
	}
	
	//����һ��List<Node>�е����ݴ���������
	public Node createBinaryTree(int[] datas){
		List<Node> list = new LinkedList<Node>();
		for(int i=0;i<datas.length;i++){
			list.add(new Node(datas[i]));
		}
		for(int i=0;i<list.size()/2-1;i++){
			list.get(i).lchild = list.get(2*i+1);
			list.get(i).rchild = list.get(2*i+2);
		}
		int lastParentNode = list.size()/2-1;
		list.get(lastParentNode).lchild = list.get(2*lastParentNode+1);
		if(list.size()%2!=0){
			list.get(lastParentNode).rchild = list.get(2*lastParentNode+2);
		}
		return list.get(0);
	}
	
	//�������
	public void preOrder(Node root){
		if(root == null){
			return ;
		}
		else{
			System.out.print(root.data+" ");
			preOrder(root.lchild);
			preOrder(root.rchild);
		}
	}
	
	//�������
	public void inOrder(Node root){
		if(root == null){
			return ;
		}
		else{
			inOrder(root.lchild);
			System.out.print(root.data+" ");
			inOrder(root.rchild);
		}
	}
	
	//�������
	public void postOrder(Node root){
		if(root == null){
			return ;
		}
		else{
			postOrder(root.lchild);
			postOrder(root.rchild);
			System.out.print(root.data+" ");
			
		}
	}
	
	//��α���
	public void levelOrder(Node root){
		if(root==null){
			return ;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){      //������зǿ�
			Node node = q.poll(); //��ͷ����
			System.out.print(node.data+" ");
			if(node.lchild!=null){
				q.offer(node.lchild);  //�����Ӿͽ��������
			}
			if(node.rchild!=null){ 
				q.offer(node.rchild);  //���Һ��Ӿͽ��Һ������
			}
		}
	}

}


