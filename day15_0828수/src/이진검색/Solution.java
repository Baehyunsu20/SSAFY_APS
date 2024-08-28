package 이진검색;

import java.util.Scanner;

public class Solution {
	static int idx;
	
	public static void main(String[] args) {
		int[] arr = { 8, 9, 17, 21, 23, 35, 88, 369 };
		idx=-1;
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		if(binaryS(arr, key)) {
			System.out.println(key+"가 존재합니다. idx : " + idx);
		}
		else {
			System.out.println(key+"가 존재하지 않습니다.");
		}
	}

	private static boolean binaryS(int[] arr, int key) {
		//양 끝단을 설정.
		int left = 0;
		//마지막 인덱스
		int right = arr.length -1;
		
		//넘어설때까지
		while(left<right) {
			
			int mid = (left+right)/2;
			
			//여기서 틀렸는데 인덱스인지 요소인지 잘 판단하자.
			if(arr[mid] == key) {
				//같아질때 리턴하기.
				idx = mid;
				return true;
			}
			else if(arr[mid]>key) {
				//중간값이 더 클때는 왼쪽으로 이동.
				right = mid-1;
			}
			else {
				//중간값이 더 작을때는 중간값 이후부터
				left = mid+1;
			}
		}
		
		//조건문에 걸리는 것이 없을 경우.
		return false;
	}


	

}
