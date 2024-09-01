package SWEA_6808_규영이와_인영이의_카드게임;

import java.util.Scanner;
import java.io.*;

public class prac {
	static boolean[] sel = new boolean[19];
	static int[] kcard = new int[9];
	static int[] icard = new int[9];
	static int wincnt;
	static int n;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("s_input.txt"));
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			wincnt = 0;
			sel = new boolean[19];
			
			for(int i=0; i<9; i++) {
				kcard[i] = sc.nextInt();
				sel[kcard[i]] = true;
			}
			
			perm(0,0,0);
			int fac = 9*8*7*6*5*4*3*2;
			
			System.out.println("#"+t+" "+ wincnt +" "+(fac - wincnt));
			
		}
		
		
	}

	private static void perm(int idx, int kscore, int iscore) {
		//기저조건
		if(idx == 9) {
			//8개의 카드를 정렬 했을 경우, 점수 비교만
			if(kscore>iscore) {
				wincnt++;
			}
			return;
		}
		
		//재귀조건
		for(int i=1; i<=18; i++) {
			
			if(!sel[i]) {
				//인영이가 가져갈 수 있는 카드
				sel[i] = true;//사용한 카드로 일단 표시
				int score = kcard[idx] + i;
				if(kcard[idx] >= i) {
					perm(idx+1,kscore+score, iscore);
				}
				else {
					perm(idx+1, kscore, iscore+score);
				}
				sel[i] = false;
			}
		}
		
	}
	

}
