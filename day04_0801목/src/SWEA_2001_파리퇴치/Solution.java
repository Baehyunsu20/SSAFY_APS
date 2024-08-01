package SWEA_2001_파리퇴치;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스가 몇개인지 받아오기
		int T = sc.nextInt();
		
		for(int test_case=1; test_case <=T; test_case++) {
			
			//테스트 케이스별 찾아야하는 값 = max
			int max = 0;
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] flies = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					flies[i][j]=sc.nextInt();
				}
			}//2차원배열로 파리배열을 가져옴.
//			System.out.println(Arrays.deepToString(flies));
			
			
			//파리채 크기에 따른 인덱스만듦 -> 자기자신을 포함한 주변 값
			//M=3이라면 9칸의 합을 더해야함.
			int[] x = new int[M*M];
			int[] y = new int[M*M];
			
			
			int idx = 0;//0~(M-1)까지.
			for(int k=0; k<M; k++) {
				for(int l=0; l<M; l++) {
					
					x[idx]=k;//K : 0,0,0, 1,1,1, 2,2,2
					y[idx]=l;//L : 0,1,2, 0,1,2, 0,1,2
					idx++;
				}
			}//파리채 사이즈에 따른 주변의 상대좌표 배열 초기화완료
//			System.out.println("X arr : "+Arrays.toString(x));
//			System.out.println("Y arr : "+Arrays.toString(y));
			
			
			//순회 시작(벽에 부딪히는 상황 제외)
			//디버깅 1: 7-5 :2 -> M-N을 포함해야한다 
			for(int i=0; i<N-M+1; i++) {
				for(int j=0; j<N-M+1; j++) {
					
					//자기 자신을 포함한 주변 합 구하기
					int sum = 0;
					//디버깅 2 : 범위가 M이 아닌 M*M임을 인지
					//예시 : 파리채사이즈가 4라면 16개의 주변 인덱스를 확인해야한다.
					for(int m=0; m<M*M; m++) {
						int dx= i+x[m];
						int dy= j+y[m];
						sum += flies[dx][dy];
//						System.out.println("더해진값"+flies[dx][dy]);
					}
					
					if(max<=sum){
						max=sum;
						}
				}
				
			}//하나씩 확인하는 반복문.
			
			
			System.out.println("#"+ test_case + " " + max);
			
			
			
		}//테스트케이스 완료.

	}
}