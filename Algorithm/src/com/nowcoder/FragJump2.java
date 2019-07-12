package com.nowcoder;

public class FragJump2 {

	/**һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
	 * @param args
	 */
	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int num = s.JumpFloorII(3);
		System.out.println(num);

	}

}
/**
 * f(0) = 1
 * f(1) = 1   //һ��ֻ��һ�ַ���
 * f(2) = f(2-1)+f(2-2) //��2�׿�����һ����1����2��֮�͵����ֵ��ƹ�ϵ
 * f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)	
 * f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
 * f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)	
 * ���Եó���
 * f(n) = 2*f(n-1)
 * �ó����ս���,��n��̨�ף�һ����1��2��...n�׵����ķ�ʽʱ���ܵ�����Ϊ��

 *            | 1       ,(n=0 ) 

 * f(n) =     | 1       ,(n=1 )

              | 2*f(n-1),(n>=2)
 * @author Administrator
 *
 */
class Solution7 {
    public int JumpFloorII(int target) {
        if(target==1){
        	return 1;
        }
        else
        	return 2*JumpFloorII(target-1);
    }
}