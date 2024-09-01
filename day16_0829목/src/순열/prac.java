package 순열;

import java.util.Arrays;

public class prac {
	static String[] arr = {"오렌지", "빵", "키위", "생크림"};
	static int n = arr.length;
	static boolean[] visited = new boolean[n];
	static String[] result = new String[n];
	static int cnt;
	
	public static void main(String[] args) {
		perm(0);
	}

	private static void perm(int idx) {
		//기저조건
		//해당 숫자를 바꾸면 원하는 크기만큼 출력.
		if(idx ==2) {
			System.out.println(++cnt+" "+Arrays.toString(result));
			return;
		}
		
		//재귀부분
		for(int i=0; i<n; i++) {
			if(visited[i]) continue;
			//재료가 포함되지 않은 경우, 값을 넣어주고
			result[idx] = arr[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] =false;
		}
		
	}

}
