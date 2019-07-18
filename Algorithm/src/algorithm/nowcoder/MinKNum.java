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
		
		MinKNum mkn = new MinKNum();
		ArrayList<Integer> minK = mkn.GetLeastNumbers_Solution(arr, 4);
		
		System.out.println("�ڶ��֣�"+minK.toString());
	}
	
	//����ð������ķ������ų���С��k�������������ұ�
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
//		int m = 1;
		for(int i=input.length-1;i>input.length-k-1;i--){			
//			System.out.println("��"+m+"��");			
			for(int j=0;j<i;j++){				
				if(input[j]<input[j+1]){
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
//			m++;
		}
		//�õ������λ��С������
		System.out.println(Arrays.toString(input));
		for(int i=input.length-1;i>input.length-k-1;i--){
			list.add(input[i]);   //����浽 list �������λ���������
		}
		return list;
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