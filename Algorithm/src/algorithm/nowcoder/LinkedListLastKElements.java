package algorithm.nowcoder;

import resource.list.LinkedList;
import resource.list.ListNode;
import java.util.Stack;

public class LinkedListLastKElements {

	/**����һ���������������k���ڵ�
	 * @param args
	 */
	public static void main(String[] args) {
		Solution12 s = new Solution12();
		LinkedList list = new LinkedList();
		int[] dataArray = {1,2,3,4,5};
		ListNode head = list.createLinkedList(dataArray);
		list.scan(head);
		System.out.println();
		ListNode node = s.FindKthToTail(head, 1);
		System.out.println("������k���ڵ��ǣ�"+node.val);

	}

}
//���Ƚ�����Ԫ��ѹջ��Ȼ���k���ڵ��ջ
//class Solution12 {
//    public ListNode FindKthToTail(ListNode head,int k) {
//    	Stack<ListNode> s = new Stack<ListNode>();
//    	ListNode work = head.next;    	
//    	while(work!=null){
//    		s.push(work);
//    		work = work.next;
//    	}
//    	for(int i=0;i<k-1;i++){  //0~k-2��Ԫ�ع�k-1��Ԫ�س�ջ�����ǵ����k��Ԫ��
//    		s.pop();
//    	}
//    	return s.pop();
//    }
//}

//�ڶ���˼·����������ָ�룬��һ��ָ�����ߵ���k���ڵ㣬Ȼ������ָ��ͬʱǰ����֪�����ߵ�ָ�뵽��ĩβ��
//���һ��ָ��ָ�ľ��ǵ�k���ڵ�
class Solution12 {
public ListNode FindKthToTail(ListNode head,int k) {
	ListNode work1 = head.next;
	ListNode work2 = work1;
	for(int i=0;i<k;i++){
		work1 = work1.next;
	}
	while(work1!=null){
		work1 = work1.next;
		work2 = work2.next;
	}
	return work2;
	}
}

//˼��ͬ�ϣ�ʵ�ַ�����ͬ
//public ListNode FindKthToTail(ListNode head,int k) { //5,{1,2,3,4,5}
//    ListNode p, q;
//    p = q = head;
//    int i = 0;
//    for (; p != null; i++) {
//        if (i >= k)
//            q = q.next;
//        p = p.next;
//    }
//    return i < k ? null : q;  //ǰ���i�ߵ�k�൱�ڵ���i��Ԫ�أ����i<k˵�������Ȳ���k��
//}