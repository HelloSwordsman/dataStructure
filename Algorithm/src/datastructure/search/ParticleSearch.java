package datastructure.search;

public class ParticleSearch {

	/**�۰���ҵ�ʵ��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6};
		ParticleSearch ps = new ParticleSearch();
		boolean contain = ps.search(arr, 0, arr.length-1, 7);
		System.out.println(contain);

	}
	
	public boolean search(int[] arr,int left,int right,int target){   //������ҵķ�Χ(left~right)
		int i = left;
		int j = right;                   //i,j �ֱ�Ϊ���ҷ�Χ����ʼλ�úͽ���λ��
		while(i<=j){                     //���i<=j��һֱ���ң�i==jʱ��i==mid==j���ж�arr[mid]==target,--
			int mid = (i+j)/2;           //--��һ�β���i=mid+1����j=mid-1������ʹi<=j����
			if(arr[mid]==target){        //����м�ֵ����Ŀ��ֵ����ֱ�ӷ���
				return true;
			}
			else if(arr[mid]<target){
				i = mid + 1;             //���Ŀ��ֵ�����м�ֵ����ôĿ��ֵ�϶����м�ֵ�ұߣ����ǲ�����ʼλ����mid+1
			}
			else
				j = mid - 1;             //���Ŀ��ֵС���м�ֵ����ôĿ��ֵ�϶����м�ֵ��ߣ����ǲ��ҽ���λ����mid-1
		}	
		return false;
	}

}
