package algorithm.nowcoder;

import java.util.Arrays;
import java.util.Stack;

public class StringReverse {

	/**�ַ�����ת
	 * ���磬��student. a am I������ȷ�ľ���Ӧ���ǡ�I am a student.��
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "student. a am I";
		StringReverse sr = new StringReverse();
		String newStr = sr.ReverseSentence(str);
		System.out.println(newStr);
	}
	
	public String ReverseSentence(String str) {
		if(str == null){ return null;}
        if(str.trim().equals("")){
           return str;
       }
		Stack<String> s = new Stack<String>(); 
		String[] strArr = str.split(" ");     //split()�������ݿո��зֳ�String����
		System.out.println(Arrays.toString(strArr));
		for(int i=0;i<strArr.length;i++){
			s.push(strArr[i]);
		}

		String newStr = s.pop();
		int stackSize = s.size();
		int k = 0;
		while(!s.isEmpty()){	
			if(k<stackSize){
				newStr = newStr + " ";
				k++;
			}
			newStr = newStr + s.pop();
		}
        return newStr;
    }

}
