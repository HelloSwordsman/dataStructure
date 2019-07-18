package algorithm.nowcoder;

import java.util.ArrayList;

public class SumEqualsS {

	/**������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
	 * Ҫ������������������ٰ���2����
	 * ����������S=100 ==> [18,19,20,21,22],[9,10,11,12,13,14,15,16]
	 * @param args
	 */
	public static void main(String[] args) {
		SumEqualsS ses = new SumEqualsS();
		ArrayList<ArrayList<Integer>> list = ses.FindContinuousSequence(100);
		for (ArrayList<Integer> arrayList : list) {
			System.out.println(arrayList);
		}

	}
	
	//����һ����������
	//��������еĺ�С��s���Ҵ��ڻ���һ��λ��(�൱�ڼ�һ����),��������еĺʹ���s���󴰿ڻ���һ��λ��(�൱�ڼ�һ����)
	//������������������У���List�洢ÿ�����������
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		//ArrayList �洢ÿ����������У������ж��� Integer ���͵�����
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int plow = 1;   //��ʼλ�ô� 1 ��ʼ
		int phigh = 2;  //����λ�ã������Ҷ�Ϊ 2 
		while(plow<phigh){
			int winSum = (plow+phigh) * (phigh-plow+1)/2;
			if(winSum==sum){
				ArrayList<Integer> alist = new ArrayList<Integer>();
				for(int i=plow;i<=phigh;i++){
					alist.add(i);
				}
				list.add(alist);
				plow++;   //���ڵĺ͵���sum��ʱӦ�ô��ڵ���ָ���ƶ�����Ϊ��ָ���ƶ��϶����� winSum>sum
			}
			else if(winSum>sum){
				plow++;
			}
			else{
				phigh++;
			}
		}
		return list;	    
	}

}

