package algorithm.nowcoder;

import java.util.ArrayList;

public class TwoNumEqualsS {

	/**����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S��
	 * ����ж�����ֵĺ͵���S������������ĳ˻���С��
	 * ����������[1,2,4,7,11,15],15  ==> [4,11]
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,4,7,11,15};
		TwoNumEqualsS tnes = new TwoNumEqualsS();
		ArrayList<Integer> list = tnes.FindNumbersWithSum(arr, 15);
		System.out.println(list);
	}
	
	//˫��ָ��бƷ�
	//
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //������¼�˻���С���������� List 
		int plow = 0;
		int phigh = array.length-1;
		while(plow<phigh){
			if(array[plow]+array[phigh]==sum){   //����������ĺ͵���sum������ȳ˻���С��������һ���ǲ�ֵ����������
				System.out.println("�ҵ���");
				list.add(0, array[plow]);        //�����ǵ����������Ǵ��������м�бƣ���˲�ֵһ�������ģ��ҵ��˺�Ϊsumһ������˻���С
				list.add(1, array[phigh]);
				break;
			}
			else if((array[plow]+array[phigh])<sum){
				plow++;
			}
			else{
				phigh--;
			}
		}
        return list;
    }

}
