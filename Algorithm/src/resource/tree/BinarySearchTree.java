package resource.tree;

import resource.tree.TreeNode;

/**������������ʵ��
 * ������������������������߶���������
 * �ص㣺������ < �� < ������
 * ���ʣ���������Ǵ�С���������
 * @param args
 */
public class BinarySearchTree {
	public TreeNode root = null;  //�����������ĸ��ڵ�
	
	//BST�Ĺ��췽��������һ�����鴴��ֱ�Ӵ���һ�� BST
	public BinarySearchTree(int[] arr){
		for(int i=0;i<arr.length;i++){
			TreeNode node = new TreeNode(arr[i]);
			if(root == null){
				root = node;
			}
			else{   //�Ӹ��ڵ㿪ʼ�Ƚϣ����Ҫ����Ľڵ�ȸ��ڵ�С������뵽���ڵ�����
				TreeNode temp = root;
				while(temp != null){
					if(node.val < temp.val){    //�����жϽڵ�����ڵ�Ĵ�С��ϵ
						if(temp.left == null){
							temp.left = node;   //����ڵ�С�ڵ�ǰ���ڵ��ָ��ڵ�����Ϊ�գ��Ͳ嵽��ǰ�ڵ������
							break;                //����ͽ���������������һ���½ڵ� node
						}
						else{
							temp = temp.left;   //���С�ڵ�ǰ���ڵ��ָ��ڵ����Ӳ�Ϊ�գ��϶�Ҫ�嵽���ڵ���ߣ�����ȥ����
						}                         //���ϸ��¸��ڵ�
					}
					else{
						if(temp.right == null){
							temp.right = node;
							break;
						}
						else{
							temp = temp.right;
						}
					}				
				}
			}
		}
	} 
	
	//�������
	public void preOrder(TreeNode root){
		if(root == null){
			return ;
		}
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//�������
	public void inOrder(TreeNode root){
		if(root == null){
			return ;
		}
		
		inOrder(root.left);
		System.out.print(root.val+" ");
		inOrder(root.right);
	}

}
