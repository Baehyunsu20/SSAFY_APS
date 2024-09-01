package 부분집합;

import java.util.ArrayList;
import java.util.List;

/**
 * 반복문을 업글한 것이 재귀라고 할 수 있을 듯
 * 
 */
public class 재귀함수 {
	static String[] 재료 = { "단무지", "햄", "오이", "시금치" };
	static int N; // 재료의 수
	static boolean[] sel; // 해당 인덱스의 재료를 사용했는지의 유무를 저장하는 배열

	public static void main(String[] args) {
		//인덱스로 선택
		sel = new boolean[4];
		System.out.println("왜");
		
		recurr(0);
		
		
	}

	private static void recurr(int idx) {
		
		// 기저조건 : idx가 끝까지 갔을 경우
		if(idx == 4) {
//			System.out.println("기저는 들어감.");
			//마지막 인덱스까지 가서 인덱스 아웃의 경우
			List<String> tmp = new ArrayList<>();
			for(int i=0; i<4; i++) {
				if(sel[i]) {
					tmp.add(재료[i]);
				}
			}System.out.println(++N+" "+tmp);
			return;
		}
		
		//idx번째 재료가 있을 경우.
		sel[idx] = true;
		recurr(idx+1);
		
		//idx번째 재료가 없을 경우.
		sel[idx] = false;
		recurr(idx+1);
		
		
		
	}
	

}
