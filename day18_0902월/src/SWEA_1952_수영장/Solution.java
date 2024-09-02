package SWEA_1952_수영장;
import java.util.*;
import java.io.*;

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
			
			//하나면 되면 1년권을 끊을 경우를 최대로 둔다.
			answer = price[3];
			recurr(0,0);
			
			System.out.println("#"+t+" "+answer);
		}
	}
	private static void recurr(int month, int total) {
		//백트래킹의 요소
		 if(total>answer) return;
		 
		 //기저조건 : 마지막 달 12월까지 고려하고 난 후, answer를 갱신
		 if(month >= 12) {
			 answer = Math.min(answer, total);
			 return;
		 }
		 
		 //재귀조건 : 운동계획이 있는 달과 운동계획이 없는 달을  if문으로 나눠서 고려
		 if(day[month] != 0) {
			 //시작 점의 값이 있을 경우,  재귀 시작.
			 //1일권, 1달권, 3달권으로 나눠서 각자 재귀
			 recurr(month+1, total+day[month]*price[0]);
			 recurr(month+1, total+price[1]);
			 recurr(month+3, total+price[2]); 
		 }
		 else {
			 recurr(month+1, total);
		 }
		
		
	}
	
}
