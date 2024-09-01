package 퀵정렬;
//호어파티션

import java.util.Arrays;

/**
 * 호어파티션
 */

public class prac {
	static int[] arr = { 7, 5, 13, 2, 79, 12, 35, 42 };
	static int n = arr.length; // 배열의 길이
	
	public static void main(String[] args) {
		quick(0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quick(int left, int right) {
		//교차하기 전까지 계속. 등호 안ㄷㄹ어감
		if(left < right) {
			int pivot = partition(left, right);
			quick(left, pivot-1);
			quick(pivot+1, right);
		}
		
		
	}

	private static int partition(int left, int right) {
		//피봇을 결정해주는 함수
		int pivot = arr[left];
		//앞뒤에서 비교
		int l= left+1;
		int r = right;
		//피봇보다 큰 값을 찾을 때까지 앞부분 찾기
		while(l<=r) {
			while(l<=r && arr[l] <= pivot) l++;
			while(arr[r]>pivot) r--;
			//값이 멈췄다면, 이제 자리를 바꿔야함
			
			//자리를 바꾸는건 등호 포함 안함.
			if(l<r) {
				int tmp= arr[r];
				arr[r] = arr[l];
				arr[l] = tmp;
			}
		}
		//피봇과 arr[r] 자리 바꾸기
		int tmp = arr[left];
		arr[left] = arr[r];
		arr[r] = tmp;
		
		return r;
	}
	

}
