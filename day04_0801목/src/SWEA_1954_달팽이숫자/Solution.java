package SWEA_1954_달팽이숫자 ;


import java.util.*;

public class Solution {
	//벽에 부딫히면 방향을 전환하는 방법 -> 방향 전환의 순서는 기존경로 포함 : →↓←↑ →↓←↑ 이것을 매서드로 빼줌.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int n = sc.nextInt();//테스트케이스 불러오기
			int[][] list = new int[n][n];
			
//			System.out.println(Arrays.deepToString(list));
			
			int x = 0;
			int y = 0;
			
			//초기값 0,1 은 →→으로 이동,
			int dx = 0;
			int dy = 1;
			
			int c_key=1;
			
			//1부터 숫자 채우기 3이 들어왔으면 1-9까지의 숫자(i) 채우기
			for(int i=1; i<=n*n; i++) {
				
				//인덱스값이 음수가 아니고 n보다 작을 경우
				if(x<n && y<n && x>=0 && y>= 0) {
					//배열 값이 채워져있지않으면 값채우기
					if(list[x][y] == 0) {
						list[x][y] = i;
//						System.out.println("입력값확인(방향전환 없음) : "+list[x][y]);
//						System.out.println("입력값확인(방향전환 없음) x : "+x);
//						System.out.println("입력값확인(방향전환 없음) y : "+y);
						//초기값 0,1 은 →→으로 이동
						x += dx;
						y += dy;
						//그럼 x,y의 위치가 옆으로 밀림.
						
					}else{
						//배열 값이 0이 아닌 경우 = 이미 값이 할당 된 경우.
						//다시 이전의 인덱스로 이동
						x -= dx;
						y -= dy;
						
						
						int[] res = change(c_key);//나머지가 1
						c_key++;//처음 : 0에서1로 변함.
						
						dx = res[0];
						dy = res[1];
						//방향전환 된 x,y
//						System.out.println("값이미 할당 : 갱신 dx "+dx+" dy"+dy);
						x += dx;
						y += dy;
						
						list[x][y] = i;

//						System.out.println("입력값확인(값이 이미 할당) : "+list[x][y]);
//						//다음 위치 판단을 위해 위치 갱신
//						System.out.println("입력값확인(값이 이미 할당) x : "+x);
//						System.out.println("입력값확인(값이 이미 할당) y : "+y);
						
						x += dx;
						y += dy;

					}

				}
				//인덱스 아웃이 났을 경우에도, 방향 전환(2)
				else{
					//다시 이전의 인덱스로 이동
//					System.out.println("입력값확인(idx out) x : "+x);
//					System.out.println("입력값확인(idx out) y : "+y);
					x -= dx;
					y -= dy;
//					System.out.println("입력값확인(idx out) x : "+x);
//					System.out.println("입력값확인(idx out) y : "+y);
					
					
					int[] res = change(c_key);//나머지가 1
					//인덱스 에러: 키값을 +1해줘서 다음 방향 전환을 고려해야함.
					c_key++;
					
					dx = res[0];
					dy = res[1];
					//방향전환 된 x,y
					x += dx;
					y += dy;
//					System.out.println("갱신 dx "+dx+" dy"+dy);
					
					list[x][y] = i;
//					System.out.println("입력값확인(인덱스아웃) : "+list[x][y]);
					
					x += dx;
					y += dy;

				}
			}
//			System.out.println(Arrays.deepToString(list));
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