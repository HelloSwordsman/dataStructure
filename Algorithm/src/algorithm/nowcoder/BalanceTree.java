package algorithm.nowcoder;

import resource.tree.TreeNode;
import resource.tree.CompleteBinaryTree;
import java.lang.Math;

public class BalanceTree {

	/**�ж�һ���������ǲ���ƽ�������
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		CompleteBinaryTree bt = new CompleteBinaryTree();
		TreeNode root = bt.createCompleteBinaryTree(arr);
		Solution16 s = new Solution16();
		System.out.print("��������α�����");
		bt.levelOrder(root);
		System.out.println();
		System.out.print("�Ƿ���ƽ���������");
		boolean is = s.IsBalanced_Solution(root);
		System.out.println(is);
	}

}

//class Solution16 {
//    public boolean IsBalanced_Solution(TreeNode root) {
//    	if(root==null){
//    		return true;   //����ǿսڵ���Ȼ��ƽ�������
//    	}
//    	
//    	if(Math.abs(getDepth(root.lchild)-getDepth(root.rchild))<=1 && IsBalanced_Solution(root.lchild)&&IsBalanced_Solution(root.rchild)){
//    		return true;
//    	}
//    	return false;
//    }
//    
//    public int getDepth(TreeNode root){
//    	if(root==null){
//    		return 0;
//    	}
//    	int nleft = getDepth(root.lchild);   //�õ��������ĸ߶�
//    	int nright = getDepth(root.rchild);  //�õ��������ĸ߶�
//    	return Math.max(nleft, nright)+1;    //���ĸ߶�Ϊ�������������������ֵ�ټ��ϸ��ڵ���һ��ĸ߶� 1
//    }
//}

//�Ż�
//����ķ���ÿ�ζ�Ҫ�ظ��������������ĸ߶ȣ�Ч�ʲ���
class Solution16 {
    public boolean IsBalanced_Solution(TreeNode root) {
    	return getDepth(root) != -1;  //-1 ����ƽ�⣬������ -1 ����true������ƽ�������
    }
    
    public int getDepth(TreeNode root){
    	if(root==null){
    		return 0;   //����ǿ��������� 0 ��ʾ��ƽ�������
    	}
    	int nleft = getDepth(root.lchild);   //�õ��������ĸ߶�
    	if(nleft == -1){                     //����������Ƿ���ƽ������������������ֱ�ӷ��� -1
    		return -1;
    	}
    	int nright = getDepth(root.rchild);   //�õ��������ĸ߶�
    	if(nright == -1){
    		return -1;
    	}
    	return Math.abs(nleft-nright)>1 ? -1 : Math.max(nleft, nright)+1;  //�����������ƽ��(���������߶Ȳ�С��1)���ͷ��������ĸ߶�
    }
}
