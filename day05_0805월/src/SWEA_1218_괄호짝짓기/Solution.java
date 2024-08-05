package SWEA_1218_괄호짝짓기;
import java.util.*;
/**
 * 4종류의 괄호들의 짝이 맞는지 판단 -> 그냥 열고 닫히는 것만 구분해도 됨.
 * 어떤 괄호가 짝이 안 맞는지는 상황 없음.
 */

public class Solution {
	static Scanner sc = new Scanner(System.in);
	static int top =-1;
	static int mode =0;
	public static void main(String[] args) {
		
		for(int t=1; t<=10; t++) {
			//총 괄호들의 갯수
			int len = sc.nextInt();
			char[] list = new char[len];
			for(int i=0; i<len; i++) {
				char tmp = sc.next().charAt(0);
				System.out.println(tmp);
				if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//열리는 괄호의 경우, push를 통해 배열에 넣기.
					push(list, tmp);
				}
				else {
					//닫는 괄호의 경우 pop -> TOP이 -1로 다 나가면  유효 / TOP이 0또는 양수이나 음수가 될때
					if(top > -1) {
						//0까지는 pop가능
						pop(list);
					}
					else if(top < -1) {
						//끝까지 다 빠지면, 멈추고 유효하지않음으로 모드 전환.
						break;
					}
				}
				//
			}//순회를 마치고 배열이 차있으면 
			if(top ==-1)mode=1;
			
			System.out.println("#"+t+" "+mode);

			
		}
		sc.close();
	}
	
	private static char[] push(char[] list, char tmp) {
		
		list[++top] = tmp;
		return list;
		
	}

	static char[] pop(char[] list) {
		//값을 빼내주고 top을 줄임
		list[top--] = 0;
		return list;
	}
	

}