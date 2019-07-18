package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import resource.tree.TreeNode;
import resource.tree.CompleteBinaryTree;
public class ScanBinaryTree {

	/**�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		CompleteBinaryTree bt = new CompleteBinaryTree();
		TreeNode root = bt.createCompleteBinaryTree(arr);
		Solution18 s = new Solution18();
		ArrayList<Integer> arrList = s.PrintFromTopToBottom(root);
		System.out.println(arrList.toString());
	}

}

class Solution18 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	if(root==null){
    		return arrList;    //����{} ���� []
    	}
    	q.add(root);
    	while(!q.isEmpty()){
    		TreeNode node = q.poll();
    		arrList.add(node.data);
    		if(node.lchild!=null){
    			q.add(node.lchild);
    		}
    		if(node.rchild!=null){
    			q.add(node.rchild);
    		}
    	}
        return arrList;
    }
}