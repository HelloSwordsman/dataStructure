package resource.tree;

import resource.tree.BinarySearchTree;
public class TreeTest {

	/**���ֶ������Ĳ�����
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5,1,7,3,9,2,6,8};
		BinarySearchTree bst = new BinarySearchTree(arr);
		System.out.print("ǰ�������");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.print("���������");
		bst.inOrder(bst.root);
	}

}
