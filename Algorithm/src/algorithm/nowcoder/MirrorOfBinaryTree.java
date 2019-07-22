package algorithm.nowcoder;

import java.util.Stack;

import resource.tree.CompleteBinaryTree;
import resource.tree.TreeNode;

public class MirrorOfBinaryTree {

	/**���������Ķ�����������任ΪԴ�������ľ���
	 * 		8
     *	   / \
     *	  6  10
     *   / \ / \
     *	5  7 9 11
     * ���
     *      8
     *	   / \
     *	  10  6
     *	 / \ / \
     *	11 9 7  5
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {8,6,10,5,7,9,11};
		CompleteBinaryTree cbt = new CompleteBinaryTree();
		TreeNode root = cbt.createCompleteBinaryTree(arr);
		System.out.println("��α���Ϊ��");
		cbt.levelOrder(root);
		MirrorOfBinaryTree mbt = new MirrorOfBinaryTree();
		mbt.Mirror(root);
		System.out.println("���������Ϊ��");
		cbt.levelOrder(root);
	}
	
	//�����ǰ�ڵ������Һ��ӣ��ͽ����Һ��ӱ���(���л���ջ),���´η��ʡ�Ȼ�����Һ��ӽ���˳��
	public void Mirror(TreeNode root) {
        if(root == null){
        	return ;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(root);
        while(!s.isEmpty()){
        	TreeNode node = s.pop();
        	if(node.left != null){
        		s.push(node.left);
        	}
        	if(node.right != null){
        		s.push(node.right);
        	}
        	if(node.left != null || node.right != null){  //�жϵ�ǰ�ڵ������ӻ����Һ���(������Ϊ�սڵ㣬������ֿ�ָ���쳣),�ͽ������Һ���
        		TreeNode temp = node.left;
        		node.left = node.right;
        		node.right = temp;
        	}      	
        }       
    }
	
	//�ݹ�ʵ��
    public void Mirror1(TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;
         
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
         
        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
