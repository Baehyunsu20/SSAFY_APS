package 이진검색;

public class prac {
	static int[] arr = { 8, 9, 17, 21, 23, 35, 88, 369 };
	static int key;
	static int idx =-1;
	public static void main(String[] args) {
		key = 21;
		//첫인덱스와 끝인덱스입력
		search(0,arr.length-1);
		System.out.println(idx);
	}
	private static void search(int left, int right) {
		
		if(left == right) {
			return;
		}
		int mid = (left+right)/2;
		if(arr[mid]==key) {
			idx = mid;
			return;
		}
		else if (arr[mid]>key)search(left, mid-1);
		else search(mid+1, right);
		
	}
	

}
