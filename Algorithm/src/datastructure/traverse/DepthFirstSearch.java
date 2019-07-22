package datastructure.traverse;

import java.util.Stack;

import resource.tree.TreeNode;
import resource.tree.CompleteBinaryTree;
public class DepthFirstSearch {

	/**������ȱ�����ʵ��(����ջʵ��)
	 * ����ͼ
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		CompleteBinaryTree bt = new CompleteBinaryTree();
		TreeNode root = bt.createCompleteBinaryTree(array);
		//����ת��Ϊ�ڽӾ���
		int[][] adj = {{0,1,1,0,0,0},    //adj.length ������
					   {1,0,0,1,1,0},    //adj[i].length �ǵ�i�е�Ԫ����(����)
			       	   {1,0,0,0,0,1},
			       	   {0,1,0,0,0,0},    
			           {0,1,0,0,0,0},
			           {0,0,1,0,0,0}}; 
		
		//��ӡ�ڽӾ���
//		for(int i=0;i<adj.length;i++){
//			for(int j=0;j<adj[i].length;j++){
//				System.out.print(adj[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.DFS(root);
		
	}
	
	//�����ڽӾ����DFS
	//��ǰ�ڵ�ĺ��Ӷ�ѹջ(BFS�Ǻ������)
	public void DFS(TreeNode root){
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.add(root);
		while(!s.isEmpty()){
			TreeNode n = s.pop();
			System.out.print(n.val+" ");
			if(n.right!=null){   //�Һ�������ջ���ջ���ͻ��ȷ�������
				s.add(n.right);
			}
			if(n.left!=null){
				s.add(n.left);
			}			
		}
	}

}
