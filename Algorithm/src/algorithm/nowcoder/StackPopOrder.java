package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.Stack;
public class StackPopOrder {

	/**���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
	 * ����ѹ��ջ���������־�����ȡ�
	 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
	 * ��ע�⣺���������еĳ�������ȵģ�
	 * @param args
	 * һ��ѹջ���л���ֶ��ֳ�ջ���е�ԭ����ѹջ��ͬʱ���Գ�ջ��
	 */
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
		Solution17 s = new Solution17();
		boolean can = s.IsPopOrder(pushA, popA);
		System.out.println(can);
	}

}

/* ˼·��
 * ����������е�Ԫ�أ�����ջ�����ջ��Ϊ�գ��Ͳ鿴ջ��Ԫ�غ͵������е�ֵ�Ƿ���ͬ��
 * ��ͬ�Ͱ�ջ����ջ���������еĵ�ǰֵ�����ƶ�һλ�������ж���һ��ѹ�����е�ֵ�뵯�����е�ֵ��û����ͬ�ġ�
 * ���ջ����ջΪ�գ��ͱ�ʾ���з���Ҫ��
 */
class Solution17 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> st = new Stack<Integer>();
        int j = 0;
        if(pushA.length == 0 || popA.length == 0)      	
            return false;
        for(int i=0;i<pushA.length;i++)   
        {       	
            st.push(pushA[i]);        //��ѹջ�����е�Ԫ������ջ��ѹջ�Ժ󣬽������ܳ�ջ��Ԫ�س�ջ
            while(!st.empty()&&st.peek()==popA[j])    //���ջ��Ϊ�գ��Ͳ鿴ջ��Ԫ�غ��Ƿ���ͬ����ͬ�ͳ�ջ
            {
                st.pop();
                j++;             //��ջ�Ժ󣬳�ջ����ָ�����
            }
        }
        return st.empty();       //������ջΪ�գ��ͷ���Ҫ��
    }
}
