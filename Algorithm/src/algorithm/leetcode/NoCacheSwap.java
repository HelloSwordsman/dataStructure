package algorithm.leetcode;

public class NoCacheSwap {

	/**һ�ֲ��ÿ��ٸ����ռ�Ľ�������
	 * @param args
	 */
	public static void main(String[] args) {
		NoCacheSwap ncs = new NoCacheSwap();
		int a = 1;
		int b = 2;

		ncs.swap2(a,b);
		System.out.println("�ں����⣺");
		System.out.println("a="+a);         //������a,bֵ����(a=1,b=2)����Ϊ��ֵ����
		System.out.println("b="+b);
	}
	
	public void swap1(int a,int b){
		System.out.println("����ǰ��");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a + b;
		b = a - b;   //b=(a+b)-b=a �൱�� b=a
		a = a - b;   //a=a-(a-b)=b �൱�� a=b
		System.out.println("������");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	//ʹ��λ����(��λ���)
	public void swap2(int a,int b){
		System.out.println("����ǰ��");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("������");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
}
