package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class MinKNum {

	/**����n���������ҳ�������С��K������
	 * ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,3,8};
		Solution20 s = new Solution20();
		ArrayList<Integer> listK = s.GetLeastNumbers_Solution(arr, 10);
		System.out.println(listK.toString());
	}

}
//˼·:
//���� Arrays ������� sort ��������������� input �������У�Ȼ��ȡǰ k ��ֵ�浽 ArrayList ��
class Solution20 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	if(k>=input.length){
    		k=input.length;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Arrays.sort(input);
    	System.out.println(Arrays.toString(input));
    	for(int i=0;i<k;i++){
    		list.add(input[i]);
    	}
        return list;
    }
}