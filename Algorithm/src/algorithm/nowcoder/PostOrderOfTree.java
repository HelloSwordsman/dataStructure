package algorithm.nowcoder;

public class PostOrderOfTree {

	/**����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No��
	 * �������������������������ֶ�������ͬ
	 * ����������[4,8,6,12,16,14,10] ==>  true
	 * ����������[5,4,3,2,1] ==> true
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		Solution19 s = new Solution19();
		boolean is = s.VerifySquenceOfBST(arr);
		System.out.println(is);
	}

}

//BST�ĺ������еĺϷ������ǣ�����һ������S�����һ��Ԫ����x ��Ҳ���Ǹ�����
//���ȥ�����һ��Ԫ�ص�����ΪT����ôT���㣺T���Էֳ����Σ�ǰһ�Σ���������С��x����һ�Σ�������������x���������Σ����������ǺϷ��ĺ������С�
//�����ĵݹ鶨�� : ) ��
class Solution19 {
    public boolean VerifySquenceOfBST(int[] sequence) {
    	if(sequence.length==0)
    		return false;   //�������Ϊ�գ�����ĳ�����ĺ�����������
    	return judge(sequence,0,sequence.length-1);
    }
    
    public boolean judge(int[] arr,int left,int right){
    	if(left>=right){    //left �� right �ֱ����жϵ�������±�
    		return true;    //����±���ȣ�Ҳ����ͬһ��Ԫ�أ������鲻Ϊ�գ�����������о��ǵ��ڵ����ĺ������
    	}
    	int i = left;
    	int j = right-1;      //�����������ұߵ�Ԫ���Ǻ���������еĸ��ڵ�
    	while(i<j && arr[j]>arr[right]){   //��right-1��ʼ���ƣ�ֱ��ָ���һ��С��right��λ�ã������Ұ벿�֣�����right��
    		j--;
    	}
    	while(i<j){          //��벿�ִӿ�ʼ���ո�j(��һ��С��right��λ��)����
    		if(arr[i]<arr[right]){  //���i��rightС��������ƣ���Ȼjλ����С��right��
    			i++;                //����ֱ��i=j-1������С��right��ִ��i++�����i==j
    		}
    		else
    			return false;       //��벿�����κ�һ��������С��right���򷵻�false
    	}
    	return judge(arr,left,i) && judge(arr,j+1,right-1); //��ʱi==j��j���ڵ�һ��С��right��λ�ã����һ��Ԫ�ز��ؼ���Ƚ�
    	
    }
}
