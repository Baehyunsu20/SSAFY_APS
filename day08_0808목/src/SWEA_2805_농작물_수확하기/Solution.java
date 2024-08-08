package SWEA_2805_농작물_수확하기;

import java.util.Scanner;

/**
 * 2차원 배열을 안해도 될듯
 * 5by5가 들어올 경우
 * 3번째인풋 -> 2,3,4 인풋 -> 전체 인풋 -> 2,3,4번째 요소를 더함 -> 3번째 요소 더함
 */

public class Solution {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T= sc.nextInt();
		for(int t=1;t<=T;t++) {
			int n = sc.nextInt();
			int th= n/2; //5가들어온다면 th는 2 / 0, 1, 2
			int[][] arr = new int[n][n];
			
			for(int i=0; i<n; i++) {
				String line = sc.next();
				for(int j=0; j<n;j++) {
					String[] line_2 = line.split("");
					arr[i][j]=Integer.parseInt(line_2[j]);
//					System.out.print(arr[i][j]+" ");
					
				}
//				System.out.println();
			}
			
			//중간 줄을 제외한 나머지 줄들의 선택적 합.
			//n=5; th = 2 (0,1,2) / 1,2,4,5번째줄 -> idx = (0, 4)(1, 3)
			int sum =0;
			int f_Idx=n-1;
			for(int k=0; k<th; k++) {
				
				//중앙값을 더해줌
				sum += arr[k][th];
				sum += arr[f_Idx-k][th];
				
				
				//중앙에서 떨어지는 값을 더해줌.
				if(k>=1) {
					for(int tmp=1 ;tmp<=k;tmp++) {
						//상단의 값
						sum += arr[k][th+tmp];
						sum += arr[k][th-tmp];
						//하단의 값
						sum += arr[f_Idx-k][th+tmp];
						sum += arr[f_Idx-k][th-tmp];
					}
				}
			}
			//2차원 배열의 중간 줄을 모두 더함.
			for(int tmp=0; tmp<n; tmp++) {
				sum += arr[th][tmp];
			}
			
			
			System.out.println("#"+t+" "+sum);

		}
		
	}
		
}
