package SWEA_6808_규영이와_인영이의_카드게임;


import java.util.Arrays;
import java.util.Scanner;
 
class Solution
{
    static boolean[] number; // 카드 사용 여부 저장 배열
    static int[] kyuCard = new int[9]; // 규영이 카드 9장을 저장하는 배열
    static int winCnt; // 승리 횟수 저장
    static int N;
     
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            number = new boolean[19]; // 카드 사용 여부 확인 배열 초기화
             
            for (int i = 0; i < 9; i++) { // 규영이의 9장 카드를 입력받아 배열에 저장하고
                N = sc.nextInt();
                kyuCard[i] = N;
                //사용했으면 true.
                number[N] = true;
            } // 입력 끝
             
            winCnt = 0; // 승리 횟수 초기화
             
            cardgame(0, 0, 0); // 순열을 이용해 이기는 경우의 수를 계산
             
            System.out.println("#" + t + " " + winCnt + " " + (9*8*7*6*5*4*3*2 - winCnt));
             
        }
    }
     
    static void cardgame(int idx, int kScore, int iScore) {
    	
        // 기저조건
        if (idx == 9) {
            if (kScore > iScore) {
                winCnt++;
            }
            return;
        }
         
        // 재귀부분
        for (int i = 1; i < 19; i++) { 
        	// 인영 카드 선택 (1~18 중 규영이가 선택하지 않은 카드)
            if(!number[i]) {
                number[i] = true; // 사용한 카드로 표시
                int score = kyuCard[idx] + i; // 두 카드의 합 계산 = 이긴 사람이 가져가는 점수
                 
                if (kyuCard[idx] >= i) { // 규영 카드가 인영 카드보다 크거나 같으면 규영 점수 += 인영 점수
                    cardgame(idx + 1, kScore + score, iScore);
                } else { // 인영 카드가 규영 카드보다 크면 인영 점수 += 규영 점수
                    cardgame(idx + 1, kScore, iScore + score);
                }
                 
                number[i] = false; // 카드 사용 해제
            }
             
        }
         
    }
}