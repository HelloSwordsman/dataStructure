package algorithm.nowcoder;

public class RecoveRect {

	/**���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
	 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 s = new Solution8();
		int num = s.RectCover(3);
		System.out.println(num);
	}

}
//����쳲����еݹ�
//�����2*target��target�����˾��θ�����������ŷţ�ֻ�ܷ�һ����ʣ�¾��θ�������target-2��������Ϊf(target-2)
//������ŷţ�����һ��Ҳֻ�ܲ����ŷ�һ�����ŵľ��Σ���ʱʣ�¾��θ�����target-2��������Ϊf(target-2)
class Solution8 {
    public int RectCover(int target) {
    	if(target==1){
    		return 1;
    	}
    	if(target==2){
    		return 2;
    	}
        return RectCover(target-1)+RectCover(target-2);
    }
}