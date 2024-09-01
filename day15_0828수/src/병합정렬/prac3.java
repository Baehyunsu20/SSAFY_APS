package 병합정렬;
import java.util.*;
/**
 * 반으로 나눠서 if()
 */


public class prac3 {
	static int[] arr = {3,2,6,8,9,1,8,41,21};
	static int  n = arr.length;
	static int[] tmp;
	
	public static void main(String[] args) {
		tmp = new int[n];
		mergesort(0, n-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesort(int left, int right) {
		//기저조건
		if(left == right) return; 
			//재귀조건
			
			int mid = (left+right)/2;
			mergesort(left, mid);
			mergesort(mid+1, right);
			merge(left, mid, right);
	
		
		
	}

	private static void merge(int left, int mid, int right) {
		int l= left;
		int r = mid+1;
		
		int idx = left;
		
		while(l<=mid && r<=right) {
			if(arr[l] <= arr[r]) {
				tmp[idx++]=arr[l++];
			}
			else {
				tmp[idx++] = arr[r++];
			}
		}
		//남은 부분 처리
		if(l<=mid) {
			for(int i=l; i<=mid; i++) {
				tmp[idx++]=arr[l++];
			}
		}
		else {
			for(int i=r; i<=right; i++) {
				tmp[idx++] = arr[r++];
			}
		}
		
		
		
		//tmp를 arr에 작용하기
		for(int i=left; i<=right; i++) {
			arr[i] = tmp[i];
		}
		
	}
 
}
