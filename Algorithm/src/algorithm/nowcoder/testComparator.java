package algorithm.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.omg.PortableInterceptor.INACTIVE;

public class testComparator {

	/**���� compareTo() �ıȽϣ�sort ���ݷ���ֵ�����Ƚϵ��������Ƿ����˳�� -1 ��������1 �͵���
	 * s2.compareTo(s1)�� s1.compareTo(s2)����Ĺؼ��ǰ���s1 s2��˳��Ƚϻ���s2 s1��˳��Ƚϡ�
	 * �м�����С�ںţ��򷵻� -1,˳��Ͳ��������Ǵ��ں��򷵻�1���͵���˳��
	 * ���� 1 �� 3 
	 * ���� 1 3 �Ƚ��򷵻� -1 ���ǲ�����������˳����� [1,3]
	 * ���� 3 1 �Ƚ��򷵻� 1(���ں�)���ǵ���������˳����� [3,1]
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {20,5,1,3};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		
		String[] strArr = {"12","2","10"};
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i=0;i<strArr.length;i++){
			list1.add(strArr[i]);
		}
		
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				Integer s1 = o1;
				System.out.println(o1+" "+o2);
				Integer s2 = o2;
				int c = s1.compareTo(s2);  //���o1>o2����1�����o1<o2���� -1,���� -1 �� o1 ���� o2 ǰ��
				int comp = s2.compareTo(s1);  //���o2>o1���� 1�����o2>o1����-1������ -1 �� o1 ���� o2 ǰ��
				System.out.println("c��"+c+" comp��"+comp);
				return comp;  			
			}
		});
		
		System.out.println(list.toString());
		
		Collections.sort(list1);   //�ַ����ıȽϹ������ȴӵ�һλ��ʼ�Ƚϣ���������Ľ��Ϊ [10, 12, 2]
		System.out.println(list1.toString());

	}

}
