package SWEA_2806_N_Queen;
import java.util.Scanner;
 
public class example {
 
    static int[] queen;
    static boolean[] visit;
    static int N, answer;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
 
            queen = new int[N];
            visit = new boolean[N];
            answer = 0;
 
            recur(0);
 
            System.out.println("#" + tc + " " + answer);
        }
    }
    
    public static void recur(int row) {
        if (row == N) {
            answer++;
            return;
        }
 
        col: for (int col = 0; col < N; col++) {
            if (visit[col])
                continue;
 
            for (int r = 0; r < row; r++) {
                int c = queen[r];
                if (Math.abs(r - row) == Math.abs(c - col)) {
                    continue col;
                }
            }
 
            queen[row] = col;
            visit[col] = true;
            recur(row + 1);
            visit[col] = false;
        }
    }
}