package algorithm.nowcoder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StrLeftRemoveN {

	/**�������ѭ������Kλ������������
	 * ���磬�ַ�����S="abcXYZdef",Ҫ�����ѭ������3λ��Ľ������"XYZdefabc"��
	 * @param args
	 */
	public static void main(String[] args) {
		String str= "abcXYZdef";
		String str1 = "abcdefg";
		
		StrLeftRemoveN slmn = new StrLeftRemoveN();
		System.out.println("String��"+str);
		System.out.println("String1��"+str1);
		String newString = slmn.LeftRotateString(str, 3);
		System.out.println("Rotate String��"+newString);
		String newString1 = slmn.LeftRotateString1(str1, 3);
		System.out.println("Rotate String1��"+newString1);
		
	}
	
	public String LeftRotateString(String str,int n) {
		Queue<Character> q = new LinkedList<Character>();
		if(str.length()==0){
			return "";
		}
		char[] ch = str.toCharArray();
		for(int i=n;i<ch.length;i++){
			q.add(ch[i]);
		}
		for(int i=0;i<n;i++){
			q.add(ch[i]);
		}
		String string = q.poll()+"";    //Queue�д���� char ���ͣ�Ҫת����String���Ϳ���ʹ�������Զ�ת���ķ�ʽ
		while(!q.isEmpty()){
			string = string + q.poll(); //����ֱ��ʹ�� q.toString() ��Ϊ���õ�����char������ʽ��String������Ҫʹ��ƴ��String�ķ�ʽ
		}
        return string;
    }
	
	public String LeftRotateString1(String str, int n) {
        int len = str.length();
        if(len == 0) 
        	return "";
        n = n % len;   //��Ҫ�Ƿ�ֹ������ƶ�λ�������ַ������ȣ����� string �� 6 λҪ�ƶ� 9 λ�Ļ����൱���ƶ� 3 λ
        str += str;    //�ַ����ĸ��ƣ�stringstring
        //sunstring()���� beginIndex~endIndex-1��Χ���ַ���
        //smiles".substring(1, 5) returns "mile" �� endIndex-beginIndex λ
        return str.substring(n, len+n); //�ӵ� n λ��ʼȡ��ֱ�� len+n �� len λ
    }

}
