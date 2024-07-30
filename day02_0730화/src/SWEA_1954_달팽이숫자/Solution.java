package SWEA_1954_달팽이숫자;

import java.util.*;

public class Solution {
	//벽에 부딫히면 방향을 전환하는 방법 -> 방향 전환의 순서는 기존경로 포함 : →↓←↑ →↓←↑ 이것을 매서드로 빼줌.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int n = sc.nextInt();//테스트케이스 불러오기
			int[][] list = new int[n][n];
			
			System.out.println(Arrays.deepToString(list));
			
			int x = 0;
			int y = 0;
			
			int dx = 0;
			int dy = 0;
			
			int c_key=0;
			
			//1부터 숫자 채우기 3이 들어왔으면 1-9까지의 숫자(i) 채우기
			for(int i=1; i<=n*n; i++) {
				
				
				if(list[x][y] ==0 && x<n && y<n && x>=0 && y>= 0) {
					//인덱스값이 음수가 아니고 n보다 작을 경우
					//배열 값이 채워져있지않으면 값채우기
					list[x][y] = i;
					x += dx;
					y += dy;
					//그럼 x,y의 위치가 옆으로 밀림.
					
				}else{
					//다시 이전의 인덱스로 이동
					x -= dx;
					y -= dy;
					
					int[] res = change(c_key);
					c_key++;
					
					dx = res[0];
					dy = res[1];
					//방향전환 된 x,y
					x += dx;
					y += dy;
					
					list[x][y] = i;

				}
				

			}
			
			System.out.println("#"+test_case);
			for(int k=0; k<n; k++) {
				for(int l=0; l<n; l++) {
					System.out.print(list[k][l] + " ");
				}
				System.out.println();
			}
			
			
		}
		

		
		sc.close();
	}
	
	
	static int[] change(int change_key) {
		int where = change_key % 4;
		
		int[] res =new int[2];
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		res[0] = dx[where];
		res[1] = dy[where];
		
		//배열로 반환
		return res;
		
	}
	
}