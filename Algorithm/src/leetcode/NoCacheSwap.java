package leetcode;

public class NoCacheSwap {

	/**һ�ֲ��ÿ��ٸ����ռ�Ľ�������
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;


		a = a + b;
		b = a - b;   //b=(a+b)-b=a �൱�� b=a
		a = a - b;   //a=a-(a-b)=b �൱�� a=b
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
	
}
