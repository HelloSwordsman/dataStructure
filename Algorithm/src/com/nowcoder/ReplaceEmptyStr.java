package com.nowcoder;

public class ReplaceEmptyStr {

	/**��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
	 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//��Ҫ��StringBuffer�ĳ��÷���
class Solution {
    public String replaceSpace(StringBuffer str) {	
    	StringBuffer newString = new StringBuffer(); 
    	for(int i=0;i<str.length();i++){             //length()�������Ի��StringBuffer�ĳ���
    		if(str.charAt(i)==' '){                  //charAt(i)���StringBuffer����iλ���ϵ��ַ�
    			newString.append("%20");             //append()������ĩβ�����ַ���
    		}
    		else
    			newString.append(str.charAt(i));
    	}
    	return newString.toString();
    }
}