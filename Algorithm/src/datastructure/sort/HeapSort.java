package datastructure.sort;

import java.util.Arrays;

public class HeapSort {

	/**�������ʵ��(�󶥶�)
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {2,3,5,1,6,7,4};  //�ѵĳ�ʼ���У�������Ϊ�Ƕ������Ĳ�α����Ľ��
		HeapSort hs = new HeapSort();
		System.out.println("��ʼ���У�"+Arrays.toString(array));//��ʼ������

		hs.adjust(array);
		
		System.out.println("����õ����У�"+Arrays.toString(array));
	}
	
	public int[] swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}
	
	//���ݴ��ݵĸ��ڵ㽨���󶥶�
	public void heapSort(int[] array,int start,int end){   //��������,���ڵ��±��Լ��������±�
		int arrLength = array.length;
		while(true){
			int lchild = 2*start+1;  //��ǰ���ڵ�����ӽڵ���±�
			if(lchild>end){
				break;    //��Ҫ���ѭ���������¸��ڵ㣬������ӵ������±곬��array.length-1��ֱ������
			}
			if(lchild+1<=end && array[lchild+1]>array[lchild]){  //lchild+1���Ϊarray.length-1
				lchild = lchild + 1;  //����Һ��Ӵ������ӣ���ָ���Һ���
			}
			if(array[lchild]>array[start]){
				array = swap(array,start,lchild);   //�����ǰָ���ֵ(���ڵ�ĺ��ӽڵ�)���ڸ��ڵ�ͺ͸��ڵ㽻��
				start = lchild;    //���ڵ�����ָ�򽻻����ӽڵ㣬����µĸ��ڵ�Ϊ������������ѣ��ͼ������µ���Ϊ��
			}
			else
				break;  //�������Ѿ�����������ڵ���ε�ѭ��
		}
	}
	
	//�������еĸ��ڵ㽨���󶥶ѣ��õ������õĴ󶥶�(��ʼ����)
	public int[] adjust(int[] array){
		for(int i=array.length/2-1;i>=0;i--){						
			heapSort(array, i,array.length-1);  //����ÿ�εĸ��ڵ㣬�����һ�����ڵ㵽���ڵ�(��ʼ����ʱ���������������)
			System.out.println("������"+Arrays.toString(array)); //���ÿ���������Ķ�����
		}
		System.out.println("����õĴ󶥶ѣ�"+Arrays.toString(array));
		for(int j=array.length-1;j>0;j--){		
			//�����õĶѵ�һ�������һ��Ԫ�ؽ���
			swap(array,0,j);
			System.out.println("swapArray:"+Arrays.toString(array));
			heapSort(array, 0, j-1); //������ʱ�������£��ѵĵ�������ÿ��-1����һ�ε����������������Ѿ������һ��λ��
									 //��˵�һ�ε����Ľ����±�Ӧ��Ϊj-1
			
		}
		return array;
	}
	

}
