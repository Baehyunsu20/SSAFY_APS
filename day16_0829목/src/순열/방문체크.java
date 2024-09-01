package 순열;
/**
 * 순열 : 순서가 중요
 */

import java.util.Arrays;

public class 방문체크 {
	static String[] arr = {"단무지", "시금치", "햄"};
	static int n = arr.length;
	static boolean[] visited;
	static String[] result;
	
	public static void main(String[] args) {
		visited = new boolean[n];
		result = new String[n];
		//첫번쨰 인덱스
		perm(0);
		
	}

	private static void perm(int idx) {
		
		//기저조건
		if(idx == n) {
			//마지막 인덱스까지 왔을 경우.
			System.out.println(Arrays.toString(result));
			return;
		}
		
		//재귀부분 : 모든 원소를 순회함.
		for(int i=0; i<n; i++) {
			//사용하지 않은 원소로 만들어야함.
			if(visited[i]) continue;
			//없는 경우에는 결과 배열에 추가
			result[idx] = arr[i];
			visited[i] = true; //사용한 원소의 경우 true;
			perm(idx+1);
			visited[i] = false;
		}
		
		
		
	}
	
	
	

}
