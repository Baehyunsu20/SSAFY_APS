package 조합;
import java.util.*;
/**
 * 모든 조합을 구히지 않고, r을 이용한 기저조건 설정
 * 
 */

public class 재귀2 {
	static String[] 재료 = { "상추", "패티", "토마토", "치즈" };
	static int n,r; // N : 재료의 수, R : 내가 뽑고 싶은 재료의 수
	static String[] sel; // 뽑은 재료들을 저장할 배열
	
	public static void main(String[] args) {
		n = 4;
		r = 2;
		sel = new String[2];
		recurr2(0,0);
		
		
	}

	private static void recurr2(int idx, int sidx) {
		
		if(sidx == r) {
			//조합의 수를 다 채웠을 경우.
			System.out.println(Arrays.toString(sel));
			return;
			
		}
		
		//재귀조건
		//idx ~ (4-2)-sidx; => 2-(0,1) ; 2,1
		for(int i=idx; i<=n-r+sidx; i++) {
			sel[sidx] = 재료[i];
			recurr2(i+1, sidx+1);
		}
		
		
		
	}
	
	

}
