package algorithm.nowcoder;

public class HannoiTower {

	/**��ŵ������ݹ�����
	 * Ҫ���������Ӵ�A�ƶ���C��Ҫ��ÿ��ֻ���ƶ�һ�����ӣ����Ҵ����Ӳ�����С��������
	 * �����С�ƶ������ķ���
	 * @param args
	 */
	public static void main(String[] args) {
		HannoiTower ht = new HannoiTower();
		ht.hannoi(3, 'A', 'B', 'C');

	}
	
	public void hannoi(int n,char A,char B,char C){   //n����������A��Դ����B�Ǹ�������C��Ŀ����
		if(n==1){
			System.out.println(A+" --> "+C);   //���ֻ��һ�����ӣ�ֱ�ӽ����ƶ���C��
		}
		else{
			hannoi(n-1, A, C, B);    //��n-1�����Ӵ�A����C�ƶ���B
			System.out.println(A+" --> "+C);  //��A�ƶ���C
			hannoi(n-1, B, A, C);    //���n-1�����Ӵ�B����A�ƶ���C
		}
	}

}
