package SWEA_1222_계산기1;
import java.util.*;
import java.io.*;

public class Solutionre {
	//+ 기호를 넣어두는
	static Stack<Character> stack = new Stack<>();
	static Stack<Character> post = new Stack<>();
	static Stack<Character> cal = new Stack<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		static Scanner sc = new Scanner(new File ("input_계산기1.txt"));
		
		for(int t=1; t<=10; t++) {
			int n = sc.nextInt();
			//후위 표기식으로 만들어둠.
			String line  = sc.next();
			
			int ans = calcul(post(line));
			
			System.out.println("#"+t+" "+ans);
			
		}
		
		
	}
	//후위연산식으로 만들어주는 것 
	//한줄을 일단 받아옴.
	private static Stack<Character> post(String line) {
		
		for(int i=0; i<line.length(); i++) {
			//문자열로 한글자씩 불러옴.
			char c = line.charAt(i);
			//숫자일때는 push
			if(c >= '0' && c <= '9') {
				
				
				
			}
			else {
				//+ 기호일때.
				
			}
		}
		
		return null;
	}

	private static int calcul(Stack<Character> list) {
		
		return 0;
	}


}
