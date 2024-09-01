package 병합정렬;

import java.util.Arrays;

public class prac2 {
	static int[] list = {1,2,3,9,7,6,33,22,51};
	static int  n;
	static int[] tmp;
	
	public static void main(String[] args) {
		n = list.length;
		tmp = new int[n];
		//처음부터 끝까지
		mergesort(0, n-1);
		//결국에는 같아짐.
		System.out.println(Arrays.toString(tmp));
		
	}

	private static void mergesort(int left, int right) {
		if(left == right)return;
		int mid = (right+left)/2;
		mergesort(left, mid);
		mergesort(mid+1, right);
		merge(left, mid, right);
		
		
	}

	private static void merge(int left, int mid, int right) {
		int l= left;
		int r= mid+1;
		int idx = left; //처음 값부터 채움
		//두가지 조건이 하나라도 어긋나면 탈출
		while(l<=mid && r<=right) {
			if(list[l] <= list[r]) tmp[idx++] = list[l++];
			else tmp[idx++]=list[r++];	
		}
		if(l<=mid) {
			for(int i=l; i<=mid; i++) tmp[idx++] = list[l++];
		}
		else {
			for(int i=r;i<=right; i++) tmp[idx++]=list[r++];
		}
		
		//정렬된 결과를 복사해주는 과정이 필요
		for(int i=left; i<=right; i++) {
			list[i] = tmp[i];
		}
		
		
	}
	

}
