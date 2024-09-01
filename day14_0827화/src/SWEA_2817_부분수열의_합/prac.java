package SWEA_2817_부분수열의_합;
import java.util.*;

public class prac {
	static int n, k, cnt;
	static int[] arr;
	static boolean[] sel;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			n = sc.nextInt();
			k = sc.nextInt();
			cnt = 0;
			arr = new int[n];
			sel = new boolean[n];
			
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt(); //입력을 받음
			}
			
			com(0);		
			System.out.println("#"+t+" "+cnt);
		}
	}


	private static void com(int idx) {
		//부분조합을 모두 구하고 그 합이 k가 되는 값 구하기
		if(idx==n) {
			//배열의 끝까지 같을 경우
			int tmp = 0;
			for(int i=0; i<n; i++) {
				if(sel[i]) tmp += arr[i];	
			}
			if(tmp ==k) {
				cnt++;
			}
			return;	
		}
		
		//재귀조건
		sel[idx] = true;
		com(idx+1);
		sel[idx] = false;
		com(idx+1);
		
		
		
	}

}
