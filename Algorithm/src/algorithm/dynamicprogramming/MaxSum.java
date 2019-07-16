package algorithm.dynamicprogramming;

public class MaxSum {

	/**����һ�����飬Ҫ��ѡ�������ڵ�Ԫ�أ�ʹԪ�غ�����������͵����ֵ
	 * [4,1,1,9,1] ==> 13 
	 * ѡ�����ڵ� 4+9 �ﵽ�͵����
	 * ����������[1,2,4,1,7,8,3] ==> 15     (1,4,7,3)
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,4,1,7,8,3};
		MaxSum ms = new MaxSum();
		int max = ms.refcMax(arr, arr.length-1);
		System.out.println("�ݹ鷽���õ������ֵ�ǣ�"+max);
		
		int imax = ms.dpMax(arr);
		System.out.println("�ǵݹ鷽���õ������ֵ�ǣ�"+imax);
	}
	
	//�ݹ�ķ���
	public int refcMax(int[] arr,int i){          //��ʾ arr �е��±� i �����ֵ
		if(i==0){  
			return arr[0];           //���ֻ��һ��Ԫ�أ����ֵ���Ǹ�Ԫ��
		}
		if(i==1){
			return Math.max(arr[0], arr[1]);      //���������Ԫ�أ����ֵ��������Ԫ���е����ֵ
		}
		int select = refcMax(arr, i-2) + arr[i];  //���ѡ���±� i ��Ԫ�أ���ô���ֵ�ǵ� i-2 �����ֵ�ӵ�ǰֵ(�±�i��ֵ)
		int noSelect = refcMax(arr, i-1);         //�����ѡ���±� i ��Ԫ�أ���ô���ֵ�ǵ� i-1 �����ֵ
		return Math.max(select, noSelect);        //���ص��±� i ʱ��ѡ�� i �Ͳ�ѡ i ��������е����ֵ���ǵ��±� i �����ֵ
	}
	
	//�ǵݹ�
	//�ǵݹ���ǽ��м���̶��浽�����У���Ҫĳ���м�ֵ��ֱ�Ӵ�������ȡ����������ݹ������ظ�������
	public int dpMax(int[] arr){
		int[] iMax = new int[arr.length];   //�����±� i �����ֵ�浽 iMax ���±� i ��λ�ã������Ҫ arr.length ������ռ�
		for(int i=0;i<arr.length;i++){
			if(i == 0){
				iMax[0] = arr[0];   //���ֻ��һ��Ԫ�أ����ֵ���Ǹ�Ԫ�أ��� 0 λ���ϴ���������ֵ
				continue;
			}
			if(i == 1){
				iMax[1] = Math.max(arr[0], arr[1]); 
				continue;
			}
			int select = iMax[i-2] + arr[i];  //���ѡ���±� i ��Ԫ�أ���ô���ֵ�ǵ� i-2 �����ֵ�ӵ�ǰֵ(�±�i��ֵ)
			int noSelect = iMax[i-1];         //ͬ��
			iMax[i] = Math.max(select, noSelect);     //�±� i ���뵽�±� i ʱѡ�� i �Ͳ�ѡ�� i �е����ֵ
		}
		
		return iMax[arr.length-1];      //���� arr �еĺ����ֵ���� iMax �е����һ��(��ʾ����arr�е�����±�����ֵ)
	}

}
