package SWEA_2806_N_Queen;

import java.util.Scanner;
/**
 *
 *
 * "방문체크"로 문제를 풀이할 수 있다.
2
1
2
 */
public class Solution {
	//체스판 확인
	static boolean[][] visit;
	static int n;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			//테케마다 값 초기화.
			n= sc.nextInt(); // 퀸의 갯수, 판의 크기
			visit = new boolean[n][n]; //체스판
			cnt=0; //cnt = 경우의 수 -> 계속 업데이트.
			
			//2차원 배열에서의 위치는 넣어줌.
			recurr(0,0);
			System.out.println("#"+t+" "+ cnt);
		}
	}

	private static void recurr(int i, int j) {
		//n번의 반복문을 통해, 각 자리를 확인
		
		//가장 마지막 인덱스에 도달하고 난 후,  퀸의 위치가 제대로 되었는지 확인(possible)
		if(i>=n && j >=n) {
			//n*n에서의 n의 조합.
			if(possible(visit)) {
				//퀸이 가능한 상황일때만 cnt를 올려줌.
				cnt++;
			}
			return;
		}
		
		//재귀 부분
		for(int k=0; k<n; k++) {
			for(int l=0; l<n; l++) {
				//이미 자리가 잡혔다면, 스킵
				if(visit[i][j]) continue;
				visit[i][j] = true;
				//바뀔 수 있는 모든 경우를 고려. 
				recurr(i+1, j);
				recurr(i+1, j+1);
				recurr(i, j+1);
				visit[i][j] = false;
			}
		}

	}

	private static boolean possible(boolean[][] visit) {
		//행, 열, 대각선 확인
		//행 확인
		outR:
		for(int i=0; i<n; i++) {
			int tcnt=0;
			for(int j=0; j<n; j++) {
				if(visit[i][j]) {
					tcnt++;
				}
				if(tcnt>1)break outR;
				
			}
			
		}
		

		//열 확인
		outC:
			for(int i=0; i<n; i++) {
				int tcnt=0;
				for(int j=0; j<n; j++) {
					if(visit[j][i]) {
						tcnt++;
					}
					if(tcnt>1)break outC;
					
				}
				
			}
		
		
		
		//대각선 확인
		out:
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(visit[i][j]) {
					// true일때의 대각선 확인
					
				}
			}
		}
		
		
		return false;
	}



}