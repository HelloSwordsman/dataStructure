package com.nowcoder;

public class Fibonacci {

	/**��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����1��Ϊ0����
	 * n<=39
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s= new Solution5();
		int n = s.Fibonacci(4);
		System.out.println(n);

	}

}
//�ݹ鷨��ȱ����������ڴ���Դ���ظ����㣬Ч�ʲ���
//class Solution5 {
//	int result = 0 ;
//    public int Fibonacci(int n) {
//    	if(n==1){
//    		return 0;
//    	}
//    	else if(n==2){
//    		return 1;
//    	}
//    	else{
//    		result = Fibonacci(n-1)+Fibonacci(n-2); 
//    		return result;
//    	}    	
//    }
//}

//�ǵݹ鷨(��0��Ϊ0)
//[0][1][1][2][3][5]
// 0  1  2  3  4  5
class Solution5 {
	int result = 0 ;
    public int Fibonacci(int n) {
    	int f = 0;
    	int g = 1;
    	for(int i=0;i<n;i++){
    		g = f+g;   //��ǰ��������ӵõ���һ����������Ϊg
    		f = g-f;   //�õõ����µ�����ȥ������f�õ��µ�f��ʹf���ǽ�����g��ǰ��һ���� 		
    	}
    	return f;
    }
}



