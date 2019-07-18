package algorithm.nowcoder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TwoNums {

	/**һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
	 * ����������[2,4,3,6,3,2,5,5] ==> 4,6
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,4,3,6,3,2,5,5};
		Solution22 s = new Solution22();
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		s.FindNumsAppearOnce(arr, num1, num2);
		System.out.println(Arrays.toString(num1)+" "+Arrays.toString(num2));
	}

}

//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
class Solution22 {
  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  int[] num = new int[2];
	  //������map�洢��(Ԫ��)ֵ(����)��
	  Queue<Integer> q = new LinkedList<Integer>();
      for(int i=0;i<array.length;i++){
    	  if(!q.contains(array[i])){
    		  q.add(array[i]);
    	  }
    	  else{
    		  q.remove(array[i]);
    	  }
      }
      for(int i=0;i<2;i++){
    	  num[i] = q.poll();
      }
      num1[0] = num[0];
      num2[0] = num[1];
  }
}
