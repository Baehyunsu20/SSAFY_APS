package 조합;
import java.util.*;
/**
 * 햄버거 조합 만들기.
 * 전체 재료의 수 N, 원하는 재료의 갯수 R
 * 
 */

public class 재귀함수 {
	static String[] 재료 = { "상추", "패티", "토마토", "치즈" };
	static int n,r;
	static boolean[] sel;
	public static void main(String[] args) {
		sel = new boolean[4]; 
		//4개의 조합 중에서 2개를 골라야함.
		n = 4;
		r = 2; 
		
		recurr(0);

		
	}
	private static void recurr(int idx) {
		
		if(idx == n) {
			List<String> tmp = new ArrayList<>();
			for(int i=0; i<n; i++) {
				if(sel[i]) {
					tmp.add(재료[i]);
				}
			}
			//범위를 잘 확인하자.
			if(tmp.size() == r) {
				System.out.println(tmp);
			}
			return;
			
		}
		
		sel[idx] = true;
		recurr(idx+1);
		
		sel[idx] = false;
		recurr(idx+1);
		
	}

}
