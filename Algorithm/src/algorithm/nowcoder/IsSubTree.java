package algorithm.nowcoder;

import resource.tree.TreeNode;

public class IsSubTree {

	/**�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1 != null && root2 != null){  //�������������һ��Ϊ�գ��ͻ�ֱ�ӷ��� result = false
			if(root1.val == root2.val){    //�����ǰ�ڵ��ֵ��ͬ�����ж�root2���ڵ����ǲ��ǵ�ǰ�ڵ������
				result = judge(root1,root2);
			}
			if(!result){   //������ǵ�ǰ�ڵ��(���ڵ�)�����������ж��ǲ��ǵ�ǰ�ڵ����ӵ�����
				result = HasSubtree(root1.left, root2);
			}
			if(!result){   //������ǵ�ǰ�ڵ��(���ڵ�)���ӵ����������ж��ǲ��ǵ�ǰ�ڵ��Һ��ӵ�����
				result = HasSubtree(root1.right, root2);
			}			
		}		
        return result;
    }

	public boolean judge(TreeNode root1, TreeNode root2) {
		if(root2 == null){
			return true;     //�����ʱroot2Ϊ�գ�˵��root2���ڵ����������ˣ�������Ҫô����һ����Ҫô��û�����꣬���������
		}
		if(root1 == null){
			return false;    //�����ʱ�����������ˣ�����������һ���ж�˵����û�����꣬��Ȼ�Ͳ�������
		}
		if(root1.val != root2.val){
			return false;    //��������ڵ��ֵ����ͬ����Ȼ��������
		}
		return judge(root1.left, root2.left) && judge(root1.right, root2.right); //���������жϣ����Һ��Ӷ���ͬ���Ǿ�������������Ͳ���
	}

}
