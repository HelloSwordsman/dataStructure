package algorithm.nowcoder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstAppearJustOne {

	/**��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��
	 * ����������NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp ==> 1
	 * ����������google ==> 4
	 * @param args
	 */
	public static void main(String[] args) {
//		String str = "google";
		String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
		FirstAppearJustOne fajo = new FirstAppearJustOne();
		int index = fajo.FirstNotRepeatingChar(str);
		System.out.println(index);
	}
	
	//ʹ��map�洢ÿ����ĸ���ֵĴ���
	public int FirstNotRepeatingChar(String str) {
		//HashMap�еļ�ֵ��ʱ����ģ�LinkedHashMapʵ������Խ���ֵ�԰������˳������TreeMap��������Ȼ˳������(�������ĸ�Ͱ���ĸ˳������)
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(!map.keySet().contains(ch[i])){
				map.put(ch[i], 1);
			}
			else{
				int count = map.get(ch[i]);
				map.put(ch[i], ++count);
			}
		}
		//Map �еļ�ֵ����û��˳���
		System.out.println(map.toString());
		for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()==1){
				char charactar = c.getKey();
				return str.indexOf(charactar);
			}
		}
        return -1;
    }
}
