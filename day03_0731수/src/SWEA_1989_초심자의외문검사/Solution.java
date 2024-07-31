package SWEA_1989_초심자의외문검사;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int t_c=1; t_c<=T; t_c++) {
			//테스트 케이스 별 검사
			String word = sc.next();
			//임시로 문자열을 받은 리스트를 만들어둠.
			String[] tmp = new String[word.length()];
			for(int i=0; i<word.length(); i++) {
				//string 쪼개기.
				//Substring(시작부분, 끝인덱스) : 끝인덱스 직전까지
				tmp[i] = word.substring(i,i+1);
			}//한 단어를 배열에 담기 완료
//			System.out.println(Arrays.toString(tmp));
			
			for(int chek=0; chek<=tmp.length/2; chek++) {
				if(!(tmp[chek].equals(tmp[tmp.length-1-chek]))) {
					//끝자리가 같지 않으면 0을 출력해야함 -> 반복문 탈출
//					System.out.println("배열 안의 값을 확인");
//					System.out.println(tmp[chek]+" "+tmp[tmp.length-1-chek]);
					System.out.println("#"+t_c+" 0");
					break;
				}else if(tmp[chek].equals(tmp[tmp.length-1-chek])) {
					//중간까지 확인을 했을 떄 결과 출력
					if(chek == tmp.length/2) {
//						System.out.println("else의 경우 : 같을 경우");
//						System.out.println(tmp[chek]+" "+tmp[tmp.length-1-chek]);
						System.out.println("#"+t_c+" 1");
					}
				
				}
			}
			
		}
		
		
	}

}