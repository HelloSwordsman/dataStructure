package algorithm.nowcoder;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 
 *     1  2  3  4 
 *     5  6  7  8 
 *     9  10 11 12 
 *     13 14 15 16 
 * �����δ�ӡ������ : 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * ����������[[1],[2],[3],[4]]      [[1]]
 * �����       [1,2,3,4]              [1]
 * @author Administrator
 */
public class OutputCircleMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,5},{2,6},{3,7},{4,8}};
		OutputCircleMatrix ocm = new OutputCircleMatrix();
		ArrayList<Integer> list = ocm.printMatrix(matrix);
		System.out.println(list.toString());
	}
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;     //�õ��������
		int col = matrix[0].length;  //�õ��������
		int left = 0,top = 0,right = col-1,buttom = row-1;
		while(left<=right && top<=buttom){
			//���ϵĴ����Ҵ�ӡ
			for(int i=left;i<=right;i++) {
				list.add(matrix[top][i]);
				}
			top++;  
			
			//���ҵĴ������´�ӡ
			for(int i=top;i<=buttom;i++) {
				list.add(matrix[i][right]);
				}
			right--;	
						
			//���µĴ��������ӡ
			if(top<=buttom)  //��Ҫ����ֻ��һ�е�ʱ��������Ҵ�ӡ�����ظ����������ӡ
			for(int i=right;i>=left;i--) {
				list.add(matrix[buttom][i]);
				}
			buttom--;
			
			//����Ĵ������ϴ�ӡ(���һ�б����ӡ��top���ظ�����˴�ӡ��top+1��[�����Ѿ�top++�ˣ����û�У�����Ҫ����])
			if(left<=right)    //����ֻ��һ�е�,right=1-1=0,�������´�ӡ��right=-1<left,�������е�,right=2-1=1,��ӡ��right-1=0==left
			for(int i=buttom;i>=top;i--) {   //���left<=right��ʱ�����Ҫ�������ϴ�ӡ��ֻ��һ�е�ʱ��Ͳ���Ҫ��
				list.add(matrix[i][left]);
			}			
			left++;
		}
		return list;	       
    }
}
