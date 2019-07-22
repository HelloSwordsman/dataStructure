package algorithm.nowcoder;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumExceedHalf {

	/**��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
	 * ���糤��Ϊ9������{1,2,3,2,2,2,5,4,2}������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,2,2,5,4,2};
		NumExceedHalf neh = new NumExceedHalf();
		int moreThanHalf = neh.MoreThanHalfNum_Solution(arr);
		System.out.println(moreThanHalf);
	}
	
	public int MoreThanHalfNum_Solution(int [] array) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int len = array.length;
		for(int i=0;i<len;i++){
			if(map.keySet().contains(array[i])){
				int times = map.get(array[i]);
				map.put(array[i], ++times);
			}
			else{
				map.put(array[i], 1);
			}
		}
		System.out.println("map �Ĵ�СΪ��"+map.size());
		for (Entry<Integer, Integer> set : map.entrySet()) {
			if(set.getValue()>len/2){
				return set.getKey();
			}
		}
        return 0;
    }

}
