package algorithm.nowcoder;

public class NumOfOne {

	/**�������Ǹ�����������1���ֵĴ�������1 �� n �� 1 ���ֵĴ�����
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		NumOfOne noo = new NumOfOne();
		int num = noo.NumberOf1Between1AndN_Solution(n);
		System.out.println(num);
	}
	//�����1~n(����n)��1���ֵĴ���
	//��Ҫ���� %10 �õ���λ��  /10ȥ����λ��
	public int NumberOf1Between1AndN_Solution(int n) {
		if(n<0){
			return 0;
		}
		int num = 0;
		for(int i=1;i<n+1;i++){
			int temp = i;
			while(true){				
				if(i%10==1){     //��ÿ���� 10 ȡģ�õ��������λ
					num++;
				}
				i = i/10;        //��ÿ������ 10 �õ����̾���ԭ����ȥ����λ��
				if(i<10){
					if(i==1)     //���ֻʣ�¸�λ�����ж������λ��(ԭ�������λ)�Ƿ�Ϊ 1
						num++;
					i = temp;    //����ʧ��ĵ㣺��� i Ҫ���µ���forѭ���е�i�������ǳ�10�������i
					break;
				}
			}
		}		
	    return num;
    }
}
