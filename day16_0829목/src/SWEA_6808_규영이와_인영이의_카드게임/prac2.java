package SWEA_6808_규영이와_인영이의_카드게임;
import java.util.*;
import java.io.*;

public class prac2 {
	static int[] kcard = new int[9];
	static int[] icard = new int[9];
	static boolean[] sel = new boolean[19];
	static int wincnt;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("s_input.txt"));
		int T =sc.nextInt();
		for(int t=1;t<=T; t++) {
			
			kcard = new int[9];
			icard = new int[9];
			sel = new boolean[19];
			wincnt = 0;
			for(int i=0; i<9; i++) {
				kcard[i] = sc.nextInt();
				sel[kcard[i]] = true;
			}
			
			perm(0,0,0);
			System.out.println("#"+t+" "+wincnt);
			
			
		}
	}


	private static void perm(int i, int kscore, int iscore) {
		if(i==9) {
			if(kscore > iscore) {
				wincnt++;
			}
			return;
		}
		
		//재귀조건
		for(int k=1; k<=18; k++) {
			if(!sel[k]) {
				//해당 숫자는 인영이가 가지는 숫자
				sel[k] =true;
				int score = kcard[i] + k;
				if(kcard[i]>=k) {
					perm(i+1, kscore+score, iscore);
				}
				else {
					perm(i+1, kscore, iscore+score);
				}
				sel[k] = false;
			}
		}
		
		
	}

}
