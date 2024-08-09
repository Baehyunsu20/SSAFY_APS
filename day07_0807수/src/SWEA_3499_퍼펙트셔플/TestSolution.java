package SWEA_3499_퍼펙트셔플;
import java.util.*;
/**
 * 두개의 큐을 만들어서 해결 (카드의 갯수를 반으로 나눠서 n/2를 기준으로 전자는 q1에 후자는 q2에 넣음)
 * 반으로 나눠서 홀수인 경우 많은 덱을 q1에 넣음(먼)
 * 큐를 만들어서 rear로 넣고 , front로 q1과 q2를 순서대로 번갈아가면서 출력.
 */
public class TestSolution {
	//1부터 1000까지니까 최대의 배열의 크기는 1000.
	static String[] queue1 = new String[1000];
	static String[] queue2 = new String[1000];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int t=1;t<=T; t++) {
			//단어의 수 몇개인지 인풋
			int n = sc.nextInt();
			// 7개의 단어가 있으면 4개 3개로 나눠서 담음.
			// 0,1,2,3  / 4,5,6 인덱스 / 7/2=올림으로 4 -1 인덱스까지 / 6/2 = 3인덱스 -1면 안됨, 0,1,2 인덱스까지
			double tmp = (double) n / 2;
			int half = (int) (Math.ceil(tmp)-1);
			
			for(int one=0; ))
			
			
		}
		
	}

}
