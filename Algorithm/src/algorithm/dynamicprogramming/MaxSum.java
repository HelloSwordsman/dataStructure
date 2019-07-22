package algorithm.dynamicprogramming;

public class MaxSum {

	/**��һ�����飬��������������������еĺ�
	 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
	 * ����������[1,-2,3,10,-4,7,2,-5] ==> 18
	 * ����� algorithm.nowcoder �е� MaxSum ��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,-2,3,10,-4,7,2,-5};
		MaxSum ms = new MaxSum();
		int max = ms.maxSum(arr);
		System.out.println(max);
	}
	
	public int maxSum(int[] arr){
		int res = arr[0]; //��¼��ǰ����������ĺ͵����ֵ
        int max=arr[0];   //����array[i]�������������ֵ
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max+arr[i], arr[i]);
            res=Math.max(max, res);
        }
        return res;
	}
}
