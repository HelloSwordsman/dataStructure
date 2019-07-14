package algorithm.nowcoder;

import resource.list.ListNode;
import resource.list.LinkedList;
public class MergeLinkedListASC {

	/**���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,6,9};
		int[] arr2 = {2,3,5,7,8};
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		ListNode head1 = list1.createLinkedList(arr1);
		ListNode head2 = list2.createLinkedList(arr2);
		System.out.println("arr1��Ԫ���ǣ�");
		list1.scan(head1);
		System.out.println();
		System.out.println("arr2��Ԫ���ǣ�");
		list2.scan(head2);
		System.out.println();
		Solution14 s = new Solution14();
		ListNode newHead = s.Merge(head1, head2);
		System.out.println("�ϳɺ�Ľ��Ϊ��");
		list1.scan(newHead);
	}

}
//�½�һ���������洢���������Ԫ��
class Solution14 {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode node = new ListNode(-1);
    	ListNode head = node;
    	ListNode work = head;
    	head.next = null;    //����ͷ�ڵ�
    	ListNode work1 = list1.next;
    	ListNode work2 = list2.next;
    	int value = 0;
    	while(work1!=null&&work2!=null){
    		if(work1.val<=work2.val){
    			value = work1.val;
    			work1 = work1.next;
    		}
    		else{
    			value = work2.val;
    			work2 = work2.next;
    		}
    			
    		ListNode newnode = new ListNode(value);
    		work.next = newnode;
    		work = work.next;
    	}
    	
    	while(work1!=null){
    		ListNode newnode = new ListNode(work1.val);
    		work.next = newnode;
    		work = work.next;
    		work1 = work1.next;
    	}
    	
    	while(work2!=null){
    		ListNode newnode = new ListNode(work2.val);
    		work.next = newnode;
    		work = work.next;
    		work2 = work2.next;
    	}
        return head;
    }
}