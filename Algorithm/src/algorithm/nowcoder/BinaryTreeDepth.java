package algorithm.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

import resource.tree.TreeNode;
import resource.tree.BinaryTree;

public class BinaryTreeDepth {

	/**����һ�ö����������������ȡ�
	 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ� 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.createBinaryTree(arr);
		System.out.print("��α�����");
		bt.levelOrder(root);
		System.out.println();
		Solution15 s = new Solution15();
		int depth = s.TreeDepth(root);
		System.out.println("���Ϊ��"+depth);
	}

}

//�ݹ鷨
//class Solution15 {
//    public int TreeDepth(TreeNode root) {
//        if(root==null){
//        	return 0;
//        }
//        int nLeft = TreeDepth(root.lchild);
//        int nRight = TreeDepth(root.rchild);
//        return nLeft>nRight ? (nLeft+1):(nRight+1);  // nLeft>nRight ? nLeft+:nRight ���᷵�� 0
//    }
//}
//�ǵݹ鷨(���ö���ʵ��)
class Solution15 {
	public int TreeDepth(TreeNode root) {
		  if(root==null){
		  	return 0;
		  }
		  Queue<TreeNode> q = new LinkedList<TreeNode>();
		  q.offer(root);
		  int depth = 0, count = 0, nextCount = 1;  //nextCount ��¼��һ����Ԫ�صĸ�������ʼ��Ϊ1��Ϊ���ڵ�
		  while(!q.isEmpty()){
			  TreeNode node = q.poll();  //����
			  count++;                   //��¼���Ӹ���
			  if(node.lchild!=null){
				  q.offer(node.lchild);  //�����ǰ�ڵ������Һ��ӣ������Һ������
			  }
			  if(node.rchild!=null){
				  q.offer(node.rchild);
			  }
			  
			  if(count == nextCount){    //������Ӹ����ﵽ��һ��Ԫ�صĸ���
				  nextCount = q.size();  //���¼�¼��ǰ��ĸ���
				  count = 0;             //���Ӹ�������Ϊ0
				  depth++;               //��ȼ� 1
			  }
		  }
		  return depth;
		}
}
