package algorithm.leetcode;

import java.util.Stack;

public class NoRecurStringLen {

	/**����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ���
	 * ����: "pwwkew" "dvdf"
	 * ���: 3
	 * ����: ��Ϊ���ظ��ַ�����Ӵ��� "wke"�������䳤��Ϊ 3��
	 * @param args
	 */
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String str = "pwwkew";
		int max = s.lengthOfLongestSubstring(str);
		System.out.println(max);
		String ss=" ";
		System.out.println(ss.length());
	}

}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
    	if(s.length()==0){
    		return 0;
    	}
    	int max_depth = 0;
    	char[] ch = s.toCharArray();
    	Stack<Character> c = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(!c.contains(ch[i])){
				c.add(ch[i]);
				if(c.size()>max_depth){
					max_depth = c.size();
				}
				System.out.println(c);
			}
			else{	
				c.add(ch[i]);
				c.remove(s.indexOf(ch[i]));
				System.out.println(c);
			}
		}
		return max_depth;
    }

}
