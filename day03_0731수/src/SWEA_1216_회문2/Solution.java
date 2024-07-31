package SWEA_1216_회문2;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t_case=1; t_case <=10; t_case++) {
			char[][] arr = new char[100][100];
			for(int in=0; in < 100; in++) {
				for(int in_c=0; in_c<100;in_c++) {
					//string으로 읽어오고, char로 바꾸기.
					String s = sc.next();
					arr[in][in_c] = s.charAt(0);
				}
			}
			
			System.out.println(Arrays.deepToString(arr));
			
		}
	}

}