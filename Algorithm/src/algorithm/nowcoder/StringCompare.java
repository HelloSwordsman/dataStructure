package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringCompare {

	/**����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
	 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,32,321};
		StringCompare sc = new StringCompare();
		String str = sc.PrintMinNumber(arr);
		System.out.println(str);
	}

	public String PrintMinNumber(int [] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		System.out.println("list��"+list.toString());
		
		Collections.sort(list, new Comparator<Integer>() {   //Comparator�ӿ��з���ָ���Ƚϵ�ֵ������

			public int compare(Integer o1, Integer o2) {
				String s1 = o1+""+o2;     //s1��s2����С�Ͱ������� 332
				String s2 = o2+""+o1;     //3 23 < 3 32 ������Ϊ o2 �� o1 С������ǰ��
				return s1.compareTo(s2);  //�����ַ����ϲ��Ƚϣ��ַ���С������ǰ��������[3,32]��321<332����32����3ǰ��
			}   //�Ƚ�������s1��s2�Ƚϣ����s1��s2С���򷵻� -1 ������ -1 �ľͽ����ȽϵĶ��� o1 ���� o2 ǰ��
			 
		});    //����2���������Ƚ�ѡ������С������ǰ�棬����o2����ǰ���ʾo2�ںϲ��ַ���ʱ����o1ǰ��Ƚ�С���õ��������������������ǰ�����С
		
		System.out.println("sorted list��"+list.toString());
		String s = "";
		for (Integer integer : list) {
			s = s + integer;
		}
		return s;
    }
}
