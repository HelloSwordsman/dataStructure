package com.nowcoder;

import java.util.Stack;

public class StackImplQueue {

	/**������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
	 * @param args
	 */
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}

class Solution3 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
        stack2.clear();
        for(int i=stack1.size()-1;i>=0;i--){
        	stack2.push(stack1.get(i));
        }
        System.out.println(stack1);
        System.out.println(stack2);
    }
    
    public int pop() {
    	stack1.remove(stack2.peek());
    	return stack2.pop();
     }
}