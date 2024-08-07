package SWEA_7102_준홍이의카드놀이;
import java.util.*;
/**
 * 1-N / 1-M 까지의 카드셋 두개가 있다.
 * 랜덤하게 한장씩 뽑아서 나온 합을 sum이라고 했을 때, 모든 sum들의 집합이 있고, 그 중에서 가장 확률이 높은 sum
 * 높은 확률이 중복일 경우, 오름차순으로 출력
 * 각 sum을 카운팅 배열에 저장해서 풀 수도 있을 듯 싶다.
 */

public class Solution {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {

			int n = sc.nextInt();
			int m = sc.nextInt();
//			System.out.println();
			
			//최댓값은 n+m -> 최댓값을 인덱스로 가지는 count 배열 만들기
			//0~(n+m) : n+m+1 (개) / 인덱스의 마지막 자리 = n+m
			int[] count = new int[n+m+1];
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
//					System.out.println("n : "+i+", m : "+j+", n+m : "+i+j);
					count[i+j]++;
				}
			}
//			System.out.println(Arrays.toString(count));
			//count 배열에서 가장 큰 수 = 많이 나오는 수 = 확률이 높은 수
			//maxTime = 최대 빈도, sum i가 몇번 등장하는지, 빈도 중 최대 빈도
			int maxTime = count[0];
			
			for(int max: count){
				if(maxTime<max) maxTime = max;
			}
			List<Integer> ans = new ArrayList<Integer>();
			for(int i=0; i<=n+m; i++){
				if(count[i]==maxTime)ans.add(i);
			}
			
			System.out.print("#"+t+" ");
			toString(ans);
			
		}sc.close();
		
	}
	
	static void toString(List<Integer> ans) {
		for(int tmp:ans) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	

	
	

}