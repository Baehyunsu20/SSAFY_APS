package SWEA_2806_N_Queen;
import java.util.Scanner;
/**
 *
 * "방문체크"로 문제를 풀이할 수 있다.
2
1
2
 */
public class Solution {
	static int n;
	static int[] QinRow;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			n = sc.nextInt();
			//경우의 수 = cnt;
			QinRow = new int[n];
			cnt = 0;
			//PutQ : 한줄에 Q를 놓는 →→방향.위치
			PutQ(0);
			System.out.println("#"+t+" "+cnt);
		}	
	}

	public static void PutQ(int idx) {
		//한줄에 Queen에 두는 위치 PutQ(0)=2 : 0번째 줄에서의 퀸의 인덱스
		
		//기저조건 : 마지막줄까지 다 뒀을 경우
		if(idx==n) {
			//n=4가 들어온 경우 -> idx=4면 인덱스 아웃
			//마지막까지 감 -> 경우의 수 카운트
			cnt++;
			return;
		}
		
		//재귀조건 : 마지막줄에 도달하지 않았으면 옆으로 확인시작.
		for(int cidx=0; cidx<n; cidx++) {
			//→→방향 위치 : cidx확인
			//idx번째 줄에서 cidx위치에 queen이 올 수 있는지 확인.(열 방향 확인 & 대각선 확인)
			if(possible(idx, cidx)) {
				QinRow[idx] = cidx;
				PutQ(idx+1);
			}
		}	
	}

	public static boolean possible(int idx, int cidx) {
		// 체스판에서의 위치 : (idx, cidx)에 퀸을 놓을 수 있는지 확인
		//열 확인 = 요소 값이 같은지 확인 , 대각선 확인 : 좌표의 각 X, Y의 차이가 같으면 = 대각선임.
		//전의 퀸 위치와 확인 : QinRow의 모든 요소 탐색
		for(int i=0; i<idx; i++) {
			//현재 idx 윗줄의 Queen을 고려해줌.
			
			//1. 열방향 확인 QinRow의 요소값이 값으면 다음으로
			if(QinRow[i] == cidx) return false;
			//2. 대각선 확인 : x값들과 y값들의 차이 
			//직전 퀸의 값 : (i, QinRow[i])
			//비교하고싶은 값 : (idx, cidx)
			if(Math.abs(i-idx) == Math.abs(QinRow[i] - cidx)) return false;
		}
		return true;
	}


}