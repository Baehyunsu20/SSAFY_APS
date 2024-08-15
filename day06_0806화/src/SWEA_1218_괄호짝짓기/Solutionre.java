package SWEA_1218_괄호짝짓기;
import java.util.*;
import java.io.*;

public class Solutionre {
	//매서드 스택의 선언은 이렇게
	//'()', '[]', '{}', '<>' 
	static Stack<Character> stack = new Stack<>();
	static boolean ans = true; 
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input괄호짝.txt"));
		
		for(int t=1; t<=10; t++) {
			ans = true;
			
			stack = new Stack<>();
			int time = sc.nextInt();
			String line = sc.next();
			
			for(int i=0; i<time ; i++) {
				//한글자로 쪼갬.
				char c = line.charAt(i);
				
				//여는 괄호일때는 push
				if(c=='[' || c=='(' || c=='{' || c=='<') {
					stack.push(c);
				}
				//닫히는 괄호일 때.
				else if(c==']') {
					if(stack.peek() == '[') {
						stack.pop();
					}
					else {
						ans = false;
						break;
					}
					
				}
				else if(c=='}') {
					if(stack.peek() == '{') {
						stack.pop();
					}
					else {
						ans = false;
						break;
					}
					
				}
				else if(c==')') {
					if(stack.peek() == '(') {
						stack.pop();
					}
					else {
						ans = false;
						break;
					}
					
				}
				else if(c=='>') {
					if(stack.peek() == '<') {
						stack.pop();
					}
					else {
						ans = false;
						break;
					}
					
				}
				
				
				
			}
			if(ans) {
				System.out.println("#"+t+" "+ 1);
			}
			else {
				System.out.println("#"+t+" "+ 0);
				
			}
			
		}
		
	}

}
