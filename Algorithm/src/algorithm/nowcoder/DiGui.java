package algorithm.nowcoder;

public class DiGui {

	/**�ݹ����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiGui dg = new DiGui();
		int r = dg.digui(5);
//		System.out.println(r);
	}
	int j = 0;
	public int digui(int n){
		j++;
		System.out.println(j+" ��");
		if(n==0)//�ݹ�߽�
			return 1;	 
		int result =  n*digui(n-1);//�ݹ鹫ʽ	
		System.out.println("result: "+result);
		return result;
	}
}
