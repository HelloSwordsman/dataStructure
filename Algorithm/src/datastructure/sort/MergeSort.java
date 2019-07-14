package datastructure.sort;

import java.util.Arrays;
/**
 * �鲢�����ʵ��(�ݹ鷨)
 * ʱ�临�Ӷȣ���� O(nlogn), � O(nlogn), ƽ�� O(nlogn)
 * �ռ临�Ӷȣ�O(n)
 * �ȶ�
 * @author Administrator
 */
public class MergeSort {
    public static void main(String []args){
        int []arr = {9,7,8,6,4,5,3,2,1};
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));
    }
    
    public void sort(int[] arr){
    	int[] temp = new int[arr.length];
    	sort(arr,0,arr.length-1,temp);   //��0~arr.length-1�ķ�Χ����temp��Ϊ�����ռ�
    }
    
    public void sort(int[] arr,int left,int right,int[] temp){
    	if(left<right){
    		int mid = (left+right)/2;
    		sort(arr,left,mid,temp);     //��0~mid�ź���
    		sort(arr,mid+1,right,temp);  //��mid+1~right�ź���
    		merge(arr,left,mid,right,temp);
    	}
    }
    
    public void merge(int[] arr,int left,int mid,int right,int[] temp){
    	int i = left;
    	int j = mid + 1;
    	int t = 0;
    	while(i<=mid && j<=right){   //��left~mid��mid+1~right�ֱ�Ƚϣ����뵽��������
    		if(arr[i]<=arr[j]){
    			temp[t++] = arr[i++];  //����С�߲��뵽��������
    		}
    		else{
    			temp[t++] = arr[j++]; 
    		}	
    	}
    	while(i<=mid){
    		temp[t++] = arr[i++];
    	}
    	while(j<=right){
    		temp[t++] = arr[j++];
    	}
    	t = 0;
    	while(left <= right){         //ʼ�ռ�סarr����ʼλ����left
            arr[left++] = temp[t++];  //temp���������ʼλ�ÿ�ʼ���Ƶ�arr��(arr����ʼλ��left��ʼ)
        }
    }
 
}
