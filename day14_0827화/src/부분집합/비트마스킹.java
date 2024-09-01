package 부분집합;
import java.util.*;

class 비트마스킹 {
	static String[] 재료 = { "단무지", "햄", "오이", "시금치" };
	static int N = 4; // 재료의 수
	static int[] sel = new int[N];
	
	public static void main(String[] args) {
		//전체 부분 조합의 수 = 2**N ,  2의 n승
		for(int i=0; i<(1<<4); i++) {
			//재료가 있는지 확인
			ArrayList<String> list = new ArrayList<>();
			for(int j=0; j<4; j++) {
				//4개의 재료 중 있는지 확인
				//
				if((i & (1<<j)) > 0) {
					//j번째 재료가 있는 경우를 다 프린트
					System.out.println(i+"번째 "+재료[j]+"가 있는 경우");
					list.add(재료[j]);
				}
			}
			System.out.println(list);
		}
	}
	

}
