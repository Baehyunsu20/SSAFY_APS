package SWEA_1209_Sum;
import java.util.*;

public class Solution {
	//이번에는 따로 함수를 만들어서 해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스는 10개
		for(int test_case=1; test_case<=10; test_case++) {
			int t_s= sc.nextInt();
			int[][] list =new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					list[i][j]=sc.nextInt();					
				}
			}//배열 초기화 완료.
			int[] max = new int[4];
			
			max[0]= rowSum(list);
			max[1]= colSum(list);
			max[2]= leftSum(list);
			max[3]= rightSum(list);
			
			int ans = max[0];
			
			for(int a:max) {
				//값 4개 중 최대값 고르기.
				if(a>=ans)ans=a;
			}
			
			System.out.println("#"+t_s+" "+ans);
		}
		
		
	}
	//배열의 크기는 100으로 동일.
	//1. 각 행의 합 중에서 최댓값을 반환해주는 함수
	static int rowSum(int[][] list) {
		
		int max = 0;
		
		for(int i=0; i<100; i++) {
			int rowsum =0;
			for(int j=0; j<100; j++) {
				rowsum += list[i][j];
			}
			//가로합의 최댓값 갱신
			if(max<=rowsum)max=rowsum;
		}
		
		return max;
		
	}
	
	
	//2. 각 열의 합을 반환하는 함수
	static int colSum(int[][] list) {
		
		int max = 0;
		for(int i=0; i<100; i++) {
			int colsum =0;
			for(int j=0; j<100; j++) {
				colsum += list[j][i];
			}
			//가로합의 최댓값 갱신
			if(max<=colsum)max=colsum;
		}
		return max;
	}
	
	
	//3. 대각선 ↘의 합
	static int rightSum(int[][] list) {
		int sum=0;
		for(int i=0; i<100; i++) {
			sum+= list[i][i];
		}

		return sum;
		
	}
	
	
	//4. 대각선 ↙의 합
	static int leftSum(int[][] list) {
		int sum = 0;
		//인덱스의 합이 인덱스최댓값(99)이다
		for(int i=0; i<100; i++) {
			sum+=list[99-i][i];
		}
		return sum;
		
	}
	
	 

}