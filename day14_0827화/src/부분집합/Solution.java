package 부분집합;

import java.util.*;

/**
 * 김밥을 만들 수 있는 모든 부분 조합을 만들어라
 * 방법 1 : 반복문을 통한 선택
 */

class Solution {
	static String[] 재료 = {"단무지", "햄", "오이", "시금치"};
	static int N = 4; //재료의 수
	static int[] sel = new int[N];//들어갈 수 있는 요소는 0과 1 뿐이다
	static List<String> com;
	static int cnt;
	private static void main(String[] args) {
		//재료의 갯수만큼의 반복이 필요함.
		cnt = 0;
		for(int i=0; i<2; i++) {
			sel[0] = i;
			for(int j=0; j<2; j++) {
				sel[1] = j;
				for(int k=0; k<2; k++) {
					sel[2] = k;
					for(int l=0; l<2; l++) {
						sel[3] =l;
						List<String> com = new ArrayList<>();	
						for(int c=0; c<N; c++) {
							if(sel[c] ==1) {
								com.add(재료[c]);
							}
						}
						
						System.out.println(++cnt+"번째 "+com);
						
					}
				}
			}
		}
		
		
	}

}