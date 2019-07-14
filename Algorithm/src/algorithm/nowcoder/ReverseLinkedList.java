package algorithm.nowcoder;

import java.util.Stack;

import resource.list.ListNode;
import resource.list.LinkedList;
public class ReverseLinkedList {

	/**����һ��������ת��������������ı�ͷ��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		LinkedList list = new LinkedList();
		ListNode head = list.createLinkedList(arr);
		System.out.println("ԭ�������˳��");
		list.scan(head);
		System.out.println();
		Solution13 s = new Solution13();
		ListNode newHead = s.ReverseList(head);
		System.out.println("��ת�������˳��");
		list.scan(newHead);
	}

}

//ͨ��������ѹջ�ٳ�ջ���½���ķ�ʽ���
//class Solution13 {
//    public ListNode ReverseList(ListNode head) {
//    	ListNode work = head.next;
//    	Stack<Integer> s = new Stack<Integer>();
//    	while(work!=null){
//    		s.push(work.val);
//    		work = work.next;
//    	}
//    	work = head;
//    	for(int i = s.size()-1;i>=0;i--){
//    		ListNode node = new ListNode(s.pop()); 
//    		work.next = node;
//    		work = work.next;
//    	}
//    	return head;
//    }
//}

//ͨ����ָ�뷴ת�ķ�ʽ
class Solution13 {
    public ListNode ReverseList(ListNode head) {
    	ListNode pre = null;  //��¼��ǰ�ڵ��ǰһ���ڵ�ͺ�һ���ڵ�
    	ListNode next = null;
    	
    	head = head.next;
    	while(head!=null){
    		next = head.next;   //���浱ǰ�ڵ�ĺ�̽ڵ㣬��Ȼ����ǰ�ڵ㸳���µĺ�̵�ʱ��ᶪʧԭ�еĺ����Ϣ������
    		head.next = pre; //���ڿ��Խ���ǰ�ڵ�ĺ����Ϊ����ǰ���ڵ�
    		pre = head; //ǰ���ڵ���ƣ��Ƶ���ǰ�ڵ��λ�ã���ͱ����˵�ǰ�ڵ�ĺ�̵�ǰ���ڵ�
    		head = next; //��ǰ�ڵ��ƶ������̽ڵ�		
    	}
    	ListNode newHead = new ListNode(-1);
    	newHead.next = pre;
    	return newHead;
    }
}


