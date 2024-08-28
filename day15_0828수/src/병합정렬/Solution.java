package 병합정렬;

import java.util.Arrays;

/**
 * mergesort와 merge
 */

public class Solution {
	static int[] arr = { 7, 5, 13, 2, 79, 12, 35, 42 };
	static int n = arr.length; // 배열의 길이
	static int[] tmp = new int[n];
	
	public static void main(String[] args) {
		//정렬하고싶은 배열의 시작과 끝 인덱스를 넣어줌.
		mergesort(0, n-1);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void mergesort(int left, int right) {
		//계속 쪼개고 들어가서, 나중에 merge로 통합할때, 크기대로 tmp에 넣어줌.
		
		if(left<right) {
			//left와 right가 같아지면 같은 위치를 가리킴. 한자리 배열이므로 더이상 쪼갤 수 없음
			//mid를 기준으로 왼쪽과 오른쪽을 쪼갬.
			int mid = (left+right)/2;
			//처음에 쪼개진 한 부분에 대해서 쪼개짐과 병합이 한번에가 아니라 부분적으로 완성되어감.
			mergesort(left, mid);
			mergesort(mid+1, right);
			merge(left, mid, right);
	
		}
	}

	private static void merge(int left, int mid, int right) {
		//병합을 통합 정렬
		int l=left;
		int r=mid+1;
		
		//arr배열을 채울 인덱스
		int idx = left;
		
		while(l<= mid && r <= right) {
			//배열을 채울 값이 남아있는 동안은 무한 루프
			if(arr[l]<arr[r]) {
				//tmp는 정렬된 값을 담는 임시 배열
				tmp[idx++] = arr[l++];
			}
			else {
				tmp[idx++] = arr[r++];
			}
		}
		//값이 남아있으면 그것을 털어줘야함.
		if(l<=mid) {
			for(int i=l; i<=mid; i++) {
				tmp[idx++] = arr[l++];
			}
		}
		else {
			for(int i=r; i<=right; i++) {
				tmp[idx++] = arr[r++];
			}
		}
		
		
		//tmp안에 정렬이 완료되면, 그것을 배열에 다시 넣어줘야함
		for(int i=left; i<=right; i++) {
			arr[i]=tmp[i];
		}

	}

}
