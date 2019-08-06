package examination;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class FindJob {

	/**���룺
	 * ÿ�����������ĵ�һ�а����������������ֱ��ʾ����������N(N<=100000)��С��������M(M<=100000)��
  	 * ��������N��ÿ�а����������������ֱ��ʾ��������Ѷ�Di(Di<=1000000000)�ͱ���Pi(Pi<=1000000000)��
	 * ��������һ�а���M�����������ֱ��ʾM��С��������ֵAi(Ai<=1000000000)��
	 * ��֤������������ı�����ͬ��
	 * �����
	 * ����ÿ��С��飬�ڵ�����һ�����һ����������ʾ���ܵõ�����߱��ꡣһ���������Ա������ѡ��
	 * ����������
	 * 3 3 
	 * 1 100 
	 * 10 1000 
	 * 1000000000 1001 
	 * 9 10 1000000000
	 * �����
	 * 100 
	 * 1000 
	 * 1001
	 * @����
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = s.nextInt();
		int m = s.nextInt();
		int[] b = new int[m];       //��¼С������������
		for(int i=0;i<n;i++){
			int Di = s.nextInt();   //�����Ѷ�
			int Pi = s.nextInt();   //���뱨��
			map.put(Di, Pi);
		}		
		for(int i=0;i<m;i++){
			int Di = s.nextInt();   //��������
			b[i] = Di;
			if(!map.containsKey(Di)){
				map.put(Di, 0); //�����������map�ļ��д���,�ͽ����浽map�в����ñ���Ϊ0(�����map����ô���ı�����Ƕ�Ӧ��value����Ҫ��)
			}			
		}
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);      //�� map �е� key ����
		int max = 0;
		for (Object key: keys) {
			max = Math.max(max, map.get(key));
			map.put((Integer) key, max);
		}
		for(int i=0;i<m;i++){
			System.out.println(map.get(b[i]));
		}
	}

}
