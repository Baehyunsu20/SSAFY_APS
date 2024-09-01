package 병합정렬;

import java.util.Arrays;

/**
 쪼개고 들어가서 합칠때 정렬
 */

public class prac {
	//총 9개의 숫자
	//
	static int[] list = {1,2,3,9,7,6,33,22,51};
	static int n;
	static int[] tmp;
	static int idx;
	
	public static void main(String[] args) {
		n = list.length;
		tmp = new int[n];
		idx = 0;
		
		//
		mergesort(0, n-1);
		System.out.println(Arrays.toString(list));
		
	}

	private static void mergesort(int left, int right) {

		
		//기저조건 left가 right를 넘어갈 경우,
		if(left == right) {
			return;
		}
		
		//재귀 조건
		int mid = (left + right)/2; //0+8  /2 =4 = idx
		mergesort(left, mid);
		mergesort(mid+1, right);
		merge(left,mid,right);
	}

	private static void merge(int left, int mid, int right) {
		//l~mid까지의 배열과 mid+1 ~ r까지의 배열이 존제
		int l = left;
		int r = mid+1;
		
		//처음부터 순차적으로 정렬하는 것이 아님, 반으로로 나눠서 앞 파트하고 뒷파트 하고. 
		int idx = left;
		while(l<=mid && r<=right) {
			if(list[l] <= list[r]) {
				tmp[idx++] = list[l++];
			}
			else {
				tmp[idx++] = list[r++];
			}
		}
		if(l<=mid) {
			for(int i=l; i<=mid; i++) {
				tmp[idx++] = list[l++];
			}
		}
		else {
			for(int i=r; i<=right; i++) {
				tmp[idx++] = list[r++];
			}
		}
		
		//이거를 추가해주는 순간 되어버림.
		for(int k=left; k<=right; k++) {
			list[k] = tmp[k];
		}
		

	}

}
