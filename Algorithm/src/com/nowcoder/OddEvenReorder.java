package com.nowcoder;

public class OddEvenReorder {

	/**����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
	 * ���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
	 * @param args
	 */
	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int[] array = {2,4,6,1,3,5,7};
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		s.reOrderArray(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}

class Solution11 {
    public void reOrderArray(int [] array) {
    	int temp = 0;
    	boolean flag = true;
    	while(true){
    		flag = true;
	    	for(int i=array.length-1;i>0;i--){
	    		if(array[i]%2!=0&&array[i-1]%2==0){ //�������ǰ���и�ż���ͻ�
	    			temp = array[i];
	    			array[i] = array[i-1];
	    			array[i-1] = temp;
	    			System.out.println("OK");
	    			flag = false;
	    		}	    		
	    	}
	    	if(flag)
	    		break;   //ֱ��û�н�����ʱ����˳�
    	}
    }
}