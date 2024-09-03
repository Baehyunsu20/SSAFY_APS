package SWEA_1952_수영장;
import java.util.*;
import java.io.*;
/***
 * 재귀와 백트래킹을 이용한 문제 풀이
 * 
 */
class Solution{
	
	 static int[] price;
	 static int[] day;
	 static int answer; 
	 
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input 수영장.txt"));
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			price = new int[4];
			day = new int[12];
			
			for(int i=0; i<4; i++) price[i]=sc.nextInt();
			for(int i=0; i<12; i++) day[i] = sc.nextInt();
			
			//1년권을 끊을 경우를 최대로 둔다. 1년권 = answer
			answer = price[3];
			
			//매개변수
			// month : 해당 달의 idx// total : 이전달 Month까지의 이용권 총액.
			//idx=0 : 1월
			recurr(0,0);
			
			System.out.println("#"+t+" "+answer);
		}
	}
	//이용권 구매를 고려해줄 Month와 직전까지의 total
	private static void recurr(int month, int total) {
		//1. 백트래킹의 요소 : 1년권보다 직전까지의 이용권 총액이 클 경우는 그 뒤를 더 할 필요가 없음.
		 if(total>answer) return;
		 
		 //2. 기저조건 : 마지막 달 12월(12월의 인덱스 = 11)까지 고려하고 난 후, //최종으로 answer를 갱신
		 if(month >= 12) {
			 //유의할 점 : 10, 11, 12월에 3개월권을 끊을 경우, 13,14,15까지 갈 수도 있음. 
//			 System.out.println("M : "+ month);
			 answer = Math.min(answer, total);
			 return;
		 }
		 //3. 재귀조건
		 if(day[month] != 0) { //운동계획이 "있는" 달
			 
			 //1일권, 1달권, 3달권으로 나눠서 각자 재귀
			 recurr(month+1, total+day[month]*price[0]); // 1일권
			 recurr(month+1, total+price[1]); // 1달권 
			 recurr(month+3, total+price[2]); // 3달권 중간에 0이 있어도 일단 고려하는 방법
		 }
		 else { //운동계획이 "없는" 달 
			 recurr(month+1, total);
		 }
	}
}
