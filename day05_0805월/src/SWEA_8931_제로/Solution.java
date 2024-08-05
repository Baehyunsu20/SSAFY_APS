package SWEA_8931_제로;
import java.util.*;
//import java.util.Stack;


public class Solution {
	static Scanner sc = new Scanner(System.in);
	static int top = -1;
	public static void main(String[] args) {
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int len = sc.nextInt();
			//전체 숫자가 몇개 들어오는지 = len
			int[] list = new int[len];
			
			
			//배열에 순서대로 숫자 넣기
			//stack으로 문제 풀기 : LIFO(Last input First ouput)
			//0이 나오면 pop으로 데이터 삭제하기
			
			for(int i=0; i<len; i++) {
				int tmp = sc.nextInt();
				if(tmp==0) {
					//이전 값을 뱉어냄
					//pop 메서드를 호출
					pop(list);
				}
				else {
					push(list, tmp);
				}
			}//이제 남아있는 수의 합을 구하기
//			int size = stack_list.size();
			double sum = 0;
			for(int i=0; i<list.length;i++) {
				sum += list[i];
			}
			System.out.println("#"+t+" "+(int)sum);
			
			
		}
		
	}
	
	//마지막 값을 뺀 리스트 반환, 마지막 값을 0으로 치환
	static int[] pop(int[] list) {
		//마지막 값을 반환
		list[top--]= 0;
		return list;
		//마지막 값을 지워줘야함

	}
	//리스트에 값을 입력하는 
	static int[] push(int[] list, int tmp) {
		
		list[++top]=tmp;
		return list;
		
		
	}

}
