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
			
			mergesort(left, mid);
			mergesort(mid+1, right);
			
			
			
		}
		return;
		
		
		
	}

}
