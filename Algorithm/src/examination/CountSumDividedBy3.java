package examination;

import java.util.Scanner;

	/**��Ŀ����
	 * СQ�õ�һ�����������: 1, 12, 123,...12345678910,1234567891011...��
	 * ����СQ�����ܷ�3����������ʺܸ���Ȥ��
	 * СQ����ϣ�����ܰ�������һ�´����еĵ�l������r��(�����˵�)�ж��ٸ������Ա�3������
	 * ��������:
	 * ���������������l��r(1 <= l <= r <= 1e9), ��ʾҪ�����������ˡ�
	 * �������:
	 * ���һ������, ��ʾ�������ܱ�3���������ָ�����
	 * ���룺
	 * 2 5
	 * �����
	 * 3
	 * ˵����
	 * 12, 123, 1234, 12345...
	 * ����12, 123, 12345�ܱ�3������
	 * @����
	 */
//public class CountSumDividedBy3 {
//	public static void main(String[] args) {
//		// �ܱ�3�����������λ֮��Ϊ3�ı����������Ŀ�Ĺؼ����ҵ� l~r ֮�������
//		// ���Է��֣�ÿ����ĩβ���ϵ�����ǰһ������1,���ֵĽ�β i �����˵� i ����������ڶ�������12����10������β��10
//		// ��������ǰһ���� * 10�ĵ�i������i��λ���η� �ټ� i���õ���i������Ȼ��Ե�i�����ж�
//		// �������ֻ��15����ǰ��Ч����Ϊ����Խ��Խ��longҲ���ɲ��¡�����Ĺؼ���Ϊ����δ�����ô�����
//		Scanner s = new Scanner(System.in);
//		int l = s.nextInt();   //������������
//		int r = s.nextInt();   //����������Ҷ�
//		CountSumDividedBy3 csb = new CountSumDividedBy3();
//		int countSum = 0;
//		for(int i=l;i<=r;i++){    //�õ�i~r�������
//			long num = 0;
//			for(int j=1;j<=i;j++){     //�����е�ĳ����i�õ���1~i��ɵ���
//				int count = csb.countDigit(j);
//				num = j+num*(long)Math.pow(10, count);  //����2λ������ǰ��������*100
//				System.out.println("nm:"+num);
//			}
//			System.out.println("num:"+num);
//			if(csb.canbeDivide(num)){
//				countSum++;
//			}
//		}
//		System.out.println(countSum);
//	}
//	
//	//�����ж��ܷ�3�����ķ���
//	boolean canbeDivide(long i){
//		long sum = 0;
//		while(i>=10){
//			long num = i%10;  //���i�����һλ��
//			sum = sum + num;
//			i = i/10;        //ȥ��i�����һλ��
//		}
//		sum = sum+i;
//		if(sum%3==0){
//			return true;
//		}
//		return false;
//	}
//	
//	//�����ж�һ����λ���ķ���
//	int countDigit(long i){
//		int count = 0;
//		while(i>=10){
//			count++;
//			i = i/10;
//		}
//		count++;
//		return count;
//	}
//}

/**
 * �ڶ��ַ����������ַ���ƴ�ӣ��ٽ��ַ���ת��Ϊ���ּ����ж�
 */
//public class CountSumDividedBy3{
//	public static void main(String[] args) {	
//		Scanner s = new Scanner(System.in);
//		int l = s.nextInt();   //������������
//		int r = s.nextInt();   //����������Ҷ�
//		System.out.println("l:"+l+" r:"+r);
//		StringBuilder stringl = new StringBuilder("");
//		StringBuilder stringr = new StringBuilder("");
//		int count = 0;
//		for(int i=1;i<=r;i++){
//			if(i<l){
//				stringl.append(i);
//			}
//			if(i>=l){
//				stringr = stringl;
//				stringr.append(i);
//				int num = Integer.parseInt(stringr.toString());
//				System.out.println("num:"+num);
//				if(num%3==0){
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
//	}
//}

/**
 * һ��������λ���ĺ�����������3�ı����������������3�ı����� �����һ������1���ڶ�����12����������123������n������123����(n-1)n������λ֮�Ϳ������(i+1)*i/2,
 * ��������Ǵ��ڵ�����λ���������һ�����Ͱ�ÿһλ�ֿ������3ȡ��Ľ������һ���ģ�����123~10�ĺ�Ϊ55����λ����45+1=46��55��46�ĸ�λ�Ͷ���10.����û��ϵ�� ���ԣ�ֱ�ӱ���l��r������ͨ�ʽ�жϼ���
 */
//public class CountSumDividedBy3{
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int l = s.nextInt();   //������������
//		int r = s.nextInt();   //����������Ҷ�
//		int count = 0;
//		for(int i=l;i<=r;i++){
//			if((1+i)*i/2%3 == 0){
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//}

/**
 * д����������i�Ժ�������Ĺ��ɣ�
 * i = 1 ----> 1
 * i = 2 ----> 0
 * i = 3 ----> 0
 * i = 4 ----> 1
 * i = 5 ----> 0
 * i = 6 ----> 0
 * i = 7 ----> 1
 * ��������Ϊ1�ľ��ǲ��������ġ�
 * ����������[1,x]֮�乲���� fuck(x) = (x+2)/3 ��1��ʣ�µĶ�����Ҫ��.
 * ��ô������[l, r]�ϵ� r-l+1�� �����У�����ٵ� fuck(r) - fuck(l-1) ��������Ҫ������֡�
 * ֱ�Ӵ�ӡ�����Ϳ����ˣ�O(1)������Ҫѭ��������
 */
public class CountSumDividedBy3{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();   //������������
		int r = s.nextInt();   //����������Ҷ�
		int count = 0;
		count = (r-l+1) - fuck(r)+fuck(l-1);
		System.out.println(count);
		
	}
	//(x+2)/3 ���뷨������ÿ3����һ����1��������1��������һ��1����2��ճ���3�������ǵ�ǰ����+2���м���(ÿ3��Ϊһ��)
	public static int fuck(int x){
		return (x+2)/3; 
	}
}

