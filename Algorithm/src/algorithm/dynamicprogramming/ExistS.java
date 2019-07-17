package algorithm.dynamicprogramming;

import java.util.Arrays;

public class ExistS {

	/**�ж��������Ƿ���ڼ���Ԫ�صĺ͵��ڸ�����ֵ
	 * ����Ԫ�غ� s ���Ǵ��� 0 ��������
	 * ����������[3,34,4,12,5,2]  s = 9  ==> True
	 * ���ɣ�3+4+2=9
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,34,4,12,5,2};
		ExistS es = new ExistS();
		
		boolean is = es.exist(arr, arr.length-1, 13);
		System.out.println("��һ���Ƿ���ڣ�"+is);
		
		boolean ie = es.ifExist(arr, 13);
		System.out.println("�ڶ����Ƿ���ڣ�"+ie);
		
	}
	
	//�ݹ鷽��(���s=0����������Ԫ����Σ�����Ķ��� true)
	public boolean exist(int[] arr,int i,int s){    //�ж����� arr �е��±� i �Ƿ����Ԫ�غ�Ϊ s
		if(i==0){
			return arr[0] == s;    //���ֻ��һ��Ԫ�أ���Ԫ�ص��� s �����㣬��������
		}
		else if(s == 0){
			return true;         //��� exist(arr[i],0) ˵���� i~arr.length-1 ���Ѿ��ҵ��˼���Ԫ�������Ϊ s
		}
		else if(arr[i] > s){     //�����ǰԪ�� arr[i]>s���Ͳ���ѡ arr[i] ��Ӧ���� 0~(i-1) �м���Ѱ��
			return exist(arr, i-1, s);
		}
		else
			return exist(arr, i-1, s-arr[i]) || exist(arr, i-1, s); //���ѡ��ǰԪ�أ��Ϳ��� i-1��û��Ԫ�غ����� s-arr[i]
	}                                                               //�����ѡ��ǰԪ�أ��Ϳ��� i-1��û��Ԫ�غ����� s������������һ����
	
	//�ǵݹ鷽��
	//���±�0~arr.length-1�Ƿ���ں�Ϊ0~s�Ĳ���ֵ����[arr.length-1,s+1]�Ķ�ά�����У���Ҫʱֱ�ӴӴ�����ý����������ȡֵ
	public boolean ifExist(int[] arr,int s){
		int[] sArr = new int[s+1];   //����һ������洢 0~s �� s+1 ��ͬ�� s ֵ
		for(int i = 0; i<s+1; i++){
			sArr[i] = i;
		}
 		boolean[][] boolArr = new boolean[arr.length][s+1];  //���ٴ洢�Ƿ�����Ĳ���ֵ����,Ĭ�ϳ�ʼֵ�� false
 		System.out.println("����ֵ�����ʼֵ�ǣ�");
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(boolArr[i]));
		}
		
//		boolArr[0][arr[0]] = true;       //i=0 ʱ��ֻ�� s==arr[0] ���Ǹ�λ��Ϊtrue������λ�ö��������� ���±� 0 ��Ԫ�غ�Ϊ s
		
		for(int i=0;i<arr.length;i++){          
			for(int j=0;j<s+1;j++){  
				if(i==0){
					if(arr[0]==sArr[j]){
						boolArr[0][j] = true;  //i=0 ʱ��ֻ�� s==arr[0] ���Ǹ�λ��Ϊtrue������λ�ö��������� ���±� 0 ��Ԫ�غ�Ϊ s
					}
					continue;
				}
				if(j == 0){
					boolArr[i][j] = true;   //j==0 �� s=0���У�ǰ���Ѿ�������s=0�������� i~arr.length-1 �м���Ԫ�غ�Ϊ s
				}
				else if(arr[i]>sArr[j]){    //���arr[i]>��ǰ s �Ͳ���ѡ��arr[i]��ȥ���� arr[i-1] �Ƿ���� s
					boolArr[i][j] = boolArr[i-1][sArr[j]];   //�ж�i-1�Ƿ����s����i-1����s����ô�ʹ���i����s
				}
				else{       //һ�������Ҳ����ѡ��ǰԪ�أ��ж�i-1�Ƿ����s-arr[i] || ��ѡ��ǰԪ�أ��ж�i-1 �Ƿ����s
					boolArr[i][j] = boolArr[i-1][sArr[j]-arr[i]] || boolArr[i-1][sArr[j]];
				}
			}
		}
		
		return boolArr[arr.length-1][s];
	}
}

