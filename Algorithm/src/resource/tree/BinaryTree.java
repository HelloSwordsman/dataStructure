package resource.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import resource.tree.TreeNode;
public class BinaryTree {

	/**�������Ĺ����Լ������������������������������α���
	 * @param args
	 */
	public static void main(String[] args) {
		int[] datas = {1,2,3,4,5,6,7};	
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.createBinaryTree(datas);
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
	public TreeNode createBinaryTree(int[] datas){
		List<TreeNode> list = new LinkedList<TreeNode>();
		for(int i=0;i<datas.length;i++){        //�ѽڵ㶼���� List ��
			list.add(new TreeNode(datas[i]));
		}
		for(int i=0;i<list.size()/2-1;i++){     //���ڵ�ķ�Χ�� 0~length/2-1
			list.get(i).lchild = list.get(2*i+1);   //������ 2*i+1
			list.get(i).rchild = list.get(2*i+2);   //������ 2*i+2
		}
		int lastParentNode = list.size()/2-1;       //�����һ�����ڵ㣬��һ�������ӣ�����ڵ����������������Һ���
		list.get(lastParentNode).lchild = list.get(2*lastParentNode+1);
		if(list.size()%2!=0){
			list.get(lastParentNode).rchild = list.get(2*lastParentNode+2);
		}
		return list.get(0);
	}
	
	//�������
	public void preOrder(TreeNode root){
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
	public void inOrder(TreeNode root){
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
	public void postOrder(TreeNode root){
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
	public void levelOrder(TreeNode root){
		if(root==null){
			return ;
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){      //������зǿ�
			TreeNode node = q.poll(); //��ͷ����
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


