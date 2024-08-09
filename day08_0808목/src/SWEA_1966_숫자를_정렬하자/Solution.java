package SWEA_1966_숫자를_정렬하자;

import java.util.Scanner;

/**
 * 숫자의 오름차순 정렬을 sort말고 하는 방법을 쓰는 건가.
 * 카운팅 정렬로 풀어볼래
 * 5이상 50이하 = 51사이즈의 배열을 만들어둠
 */

public class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			
			int num = sc.nextInt();
			int[] count = new int[51];
			//0부터 5 전까지
			for(int line=0; line<num;line++) {
				//숫자를 읽어옴
				int c = sc.nextInt();
				count[c]++;
			}
			
			System.out.print("#"+t+" ");
			for(int p=0; p<count.length; p++) {
				if(count[p]>=1) {
					for(int i=0;i<count[p];i++) {
						//카운트가 1개면 1번만 출력, 0번 인덱스까지만
						//2번이면 0, 1 인덱스로 출력
						System.out.print(p+" ");
					}
					
				}
			}System.out.println();
			
		}
		
	}
	

}