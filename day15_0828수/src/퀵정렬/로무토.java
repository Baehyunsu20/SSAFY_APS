package 퀵정렬;

import java.util.Arrays;

/**
 * 가장 오른쪽 = 피봇
 * i= left -1에서 시작
 * j=left에서 시작
 * 
 */

public class 로무토 {
	static int[] arr = { 7, 5, 13, 2, 79, 12, 35, 42 };
	static int n = arr.length; // 배열의 길이
	
	public static void main(String[] args) {
		quickL(0,n-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickL(int left, int right) {
		if(left<right) {
			int pivot = part(left, right);
			quickL(left, pivot-1);
			quickL(pivot +1, right);
		}
		
	}

	private static int part(int left, int right) {
		int i = left-1;
		int pivot = arr[right];
		
		for(int j=left; j<right; j++) {
			//j와 피봇을 비교했을때 작을 경우에 i++, 스왑
			//피봇보다 큰 경우에는 그냥 i는 그대로.
			if(arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] =tmp;
			}
		}//j의 순회를 마치고, 피봇과 i 다음의 위치를 바꿈.
		int tmp = arr[i+1];
		arr[i+1]= arr[right];
		arr[right] = tmp;
		
		
		return i+1;
	}

}
