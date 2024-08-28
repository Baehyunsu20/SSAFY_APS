package 퀵정렬;

import java.util.Arrays;

/**
 * 하나의 피벗을 정해서 자신보다 작은 파트와 큰 파트를 나눔.
 * 나눈 후에 피벗을 자신보다 작은 파트의 마지막 요소와 바꿈.
 * 불안정정렬 : 서로 떨어진 원소끼리의 교환이 일어나는 알고리즘
 * 
 * 해당 강의에서는 첫번째 요소를 피벗 설정.
 */

public class Solution {
	//
	static int[] arr = { 7, 5, 13, 2, 79, 12, 35, 42 };
	static int n = arr.length; // 배열의 길이
	
	public static void main(String[] args) {
		quicksort(0,n-1);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void quicksort(int left, int right) {
		
		if(left < right) {
			int pivot = partition(left,right);
			//pivot을 제와한ㅇ 왼쪽과 오른쪽 정렬
			quicksort(left, pivot-1);
			quicksort(pivot+1, right);
		}
		
		
		
	}

	private static int partition(int left, int right) {
		//다음 피봇찾기
		int pivot = arr[left];
		int l=left+1;
		int r=right;
		
		while(l<=r) {
			//피봇보다 큰 arr[l] 찾기.
			while(l<=r && arr[l]<=pivot)l++;
			while(l<=r && arr[r]>pivot)r--;
			
			//arr[l]= 피봇보다 크거나 같은값
			//arr[r]= 피봇보다 작은 값.
			//같아 질때 교차만 하고 빠져나갈 수 있음.
			if(l<r) {
				//swap
				int tmp = arr[r];
				arr[r] = arr[l];
				arr[l] = tmp;
			}
		}
		//이제 l과 r이 교차되어서 나옴.
		//피봇(left)과 r의 위치를 바꿔주고 그 값을 pivot으로 리턴.
		int tmp = arr[left];
		arr[left] = arr[r];
		arr[r] = tmp;
		
		//피봇의 위치를 반환
		return r;
	}

}
