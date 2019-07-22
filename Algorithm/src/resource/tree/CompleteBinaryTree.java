package resource.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import resource.tree.TreeNode;
public class CompleteBinaryTree {

	/**��ȫ�������Ĺ����Լ������������������������������α���
	 * �ص㣺��������������Ϊh������ h ���⣬�������� (1~h-1) �Ľ�������ﵽ���������� h �����еĽ�㶼��������������ߣ��������ȫ��������
	 *      ������Ϊ��ȫ�������������������������֦�õ���
	 * @param args
	 */
	public static void main(String[] args) {
		int[] datas = {1,2,3,4,5,6,7};	
		CompleteBinaryTree bt = new CompleteBinaryTree();
		TreeNode root = bt.createCompleteBinaryTree(datas);
		System.out.println("root: "+root.val);
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
	public TreeNode createCompleteBinaryTree(int[] datas){
		List<TreeNode> list = new LinkedList<TreeNode>();
		for(int i=0;i<datas.length;i++){        //�ѽڵ㶼���� List ��,������ֱ�Ӹ����±������õ���Ӧ��Ԫ�أ��Ӷ����Ը����±��ϵ����CBT
			list.add(new TreeNode(datas[i]));
		}
		for(int i=0;i<list.size()/2-1;i++){         //���ڵ��-��Χ�� 0~length/2-1
			list.get(i).left = list.get(2*i+1);   //������ 2*i+1
			list.get(i).right = list.get(2*i+2);   //������ 2*i+2
		}
		int lastParentNode = list.size()/2-1;       //�����һ�����ڵ㣬��һ�������ӣ�����ڵ����������������Һ���
		list.get(lastParentNode).left = list.get(2*lastParentNode+1);
		if(list.size()%2!=0){
			list.get(lastParentNode).right = list.get(2*lastParentNode+2);
		}
		return list.get(0);
	}
	
	//�������
	public void preOrder(TreeNode root){
		if(root == null){
			return ;
		}
		else{
			System.out.print(root.val+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//�������
	public void inOrder(TreeNode root){
		if(root == null){
			return ;
		}
		else{
			inOrder(root.left);
			System.out.print(root.val+" ");
			inOrder(root.right);
		}
	}
	
	//�������
	public void postOrder(TreeNode root){
		if(root == null){
			return ;
		}
		else{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.val+" ");
			
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
			System.out.print(node.val+" ");
			if(node.left!=null){
				q.offer(node.left);  //�����Ӿͽ��������
			}
			if(node.right!=null){ 
				q.offer(node.right);  //���Һ��Ӿͽ��Һ������
			}
		}
	}

}


