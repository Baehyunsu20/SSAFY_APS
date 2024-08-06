package SWEA_1218_괄호짝짓기;
import java.util.*;
import j
/**
 * 4종류의 괄호들의 짝이 맞는지 판단 
 * 여는 괄호와 닫는 괄호의 갯수가 같아도 짝이 맞게 같지않다면 유효 하지 않다 =0
 * 짝이 맞게 갯수도 맞아야함.
 * 그럼 stack을 4개를 만들어야하나?
 */

public class Solution {
	static Scanner sc = new Scanner(System.in);
	static int top =-1;
	static int mode =0;
	//4종류의 괄호 :  '()', '[]', '{}', '<>'  : 순으로 first -> fourth
	static List<Character> first = new ArrayList<>();
	static List<Character> second = new ArrayList<>();
	static List<Character> third = new ArrayList<>();
	static List<Character> fourth = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		for(int t=1; t<=10; t++) {
			//총 괄호들의 갯수
			int len = sc.nextInt();
			String inputLine = sc.next();
			
			for(int i=0; i<len; i++) {
				char tmp = sc.next().charAt(i);
				System.out.println(tmp);
				if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//열리는 괄호의 경우, push를 통해 배열에 넣기.
					push(list, tmp);
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				else if(tmp=='(' || tmp=='[' || tmp=='{' || tmp=='<') {
					//
				}
				//
			}//순회를 마치고 배열이 차있으면 
			if(top ==-1)mode=1;
			
			System.out.println("#"+t+" "+mode);

			
		}
		sc.close();
	}
	
	static boolean isEmpty(List<Character> list) {
		return list.isEmpty();
		
	}
	
	private static void push(List<Character> list, char tmp) {
		list.add(tmp);
	}

	static char pop(List<Character> list) {
		if(isEmpty(list)) {
			//비어있으면
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
		char peek = list.get(list.size()-1);
		list.remove(peek);
		return peek;
	}
	

}