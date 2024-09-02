package exam;

//import java.util.Arrays;
//
//public class tmp {
//	public static void main(String[] args) {
//		//별찍기가 왜 안되냐
//		int[] cnt = {2,3,0};
//		char[][] arr = new char[3][3];
//		
//		
//		
//		for(int i=0; i<3; i++) {
//			for(int j=2; j>=0; j--) {
//				if(cnt[i] > 0) {
//					arr[j][i] ='*';
//					cnt[i]--;
//				}
//				
//			}
//			
//		}
//		
//		System.out.println(arr[0][2]);
//		System.out.println(Arrays.deepToString(arr));
//		
//		for(int i=0;  i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//
//}


///////////


import java.util.*;

public class tmp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int n = sc.nextInt();//격자의 크기
			String line = sc.next(); // 입력을 한줄로 받아옴
			char[][] arr = new char[n][n];
			
			//cnt[0] : 0번 컬럼에 쌓이는 별의 수
			int[] cnt = new int[n];
			
			for(int i=0; i<line.length(); i++) {
				int tmp = line.charAt(i);
				int input = tmp - '0'; // 하나의 값을 받아옴
				//input = 0 -> ㅇ0번 줄에 별이 쌓임.
//				System.out.print(input);
				
				//이미 해당 줄이 가득 차 있으면 블록 무시 가능
				if(cnt[input]>=n)continue;
				
				//블록이 차있지않으면, 일단 카운트(별 갯수 적용)
				cnt[input]++;
				
				//아랫줄에 다 차있는지 확인 -> 차있으면 그만큼 cnt삭제
				//순회하면서 몇개의 별들이 있는지 모든 col확인
				int min=cnt[0]; // 줄들의 최솟값만큼 빼기
				for(int c=0; c<n; c++) {
					if(min>cnt[c])min=cnt[c];
				}
				//최솟값만큼 빼주기
				//최솟값이 0이면 0을 빼니까 상관없음.
				for(int c=0; c<n; c++) {
					cnt[c] -= min;
				}

			}//모든 입력 끝, 별 갯수 확인 완료 cnt[col] 로 줄별 별의 갯수 확인.
//			System.out.println(Arrays.toString(cnt));
			// 여기까지 정답, 줄별 별의 갯수는 맞음.
			
			for(int i=0; i<n; i++) {
				for(int j=n-1; j>=0; j--) {
					if(cnt[i]>0) {
						arr[j][i] = '*';
						//별을 채우면 별 갯수를 하나 줄임.
						cnt[i]--;
					}
					else {
						//더이상 채울 별이 없으면 나감.
						break;
					}
					
				}
			}//2차원 배열을 만듦
			
			System.out.println();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
			
			
		}
		
	}

}
