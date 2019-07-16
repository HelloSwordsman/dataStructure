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
					if(node.data < temp.data){    //�����жϽڵ�����ڵ�Ĵ�С��ϵ
						if(temp.lchild == null){
							temp.lchild = node;   //����ڵ�С�ڵ�ǰ���ڵ��ָ��ڵ�����Ϊ�գ��Ͳ嵽��ǰ�ڵ������
							break;                //����ͽ���������������һ���½ڵ� node
						}
						else{
							temp = temp.lchild;   //���С�ڵ�ǰ���ڵ��ָ��ڵ����Ӳ�Ϊ�գ��϶�Ҫ�嵽���ڵ���ߣ�����ȥ����
						}                         //���ϸ��¸��ڵ�
					}
					else{
						if(temp.rchild == null){
							temp.rchild = node;
							break;
						}
						else{
							temp = temp.rchild;
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
		System.out.print(root.data+" ");
		preOrder(root.lchild);
		preOrder(root.rchild);
	}
	
	//�������
	public void inOrder(TreeNode root){
		if(root == null){
			return ;
		}
		
		inOrder(root.lchild);
		System.out.print(root.data+" ");
		inOrder(root.rchild);
	}

}
