package algorithm.nowcoder;

public class FragJump {

	/**һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution6 s = new Solution6();
		int num = s.JumpFloor(4);
		System.out.println(num);

	}

}
//�ݹ鷨
//���Է��ֵݹ������ڣ�
//1.��ǰ�����ǰ��Ľ���йأ����ǹؼ������ҵ����ֹ��ɣ�Ҳ���ǵ��ƹ�ϵ
//2.�ҵ��Ͳ�ͬ����йصĽ�������(��������ĵ��ƹ�ϵ����ǰһ����1����2���Ĳ�ͬ�������ô��������������1������2��ʱ�ķ�����)
//���⣬���쳲����У�������ʹ�÷ǵݹ鷽ʽ
class Solution6 {
    public int JumpFloor(int target) {
    	if(target==1){
    		return 1;
    	}
    	if(target==2){ //���̨������2������������(1,1)(2)
    		return 2;
    	}
    	return JumpFloor(target-2)+JumpFloor(target-1);//������n�׵ķ���������һ����1������һ����2���ķ���֮��

    }
}
