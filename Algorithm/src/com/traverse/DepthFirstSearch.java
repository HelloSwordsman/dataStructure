package com.traverse;

import java.util.Stack;

import resource.tree.Node;
import resource.tree.BinaryTree;
public class DepthFirstSearch {

	/**������ȱ�����ʵ��(����ջʵ��)
	 * ����ͼ
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		BinaryTree bt = new BinaryTree();
		Node root = bt.createBinaryTree(array);
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
	public void DFS(Node root){
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while(!s.isEmpty()){
			Node n = s.pop();
			System.out.print(n.data+" ");
			if(n.rchild!=null){   //�Һ�������ջ���ջ���ͻ��ȷ�������
				s.add(n.rchild);
			}
			if(n.lchild!=null){
				s.add(n.lchild);
			}
			
			
		}
	}

}
