package Stack2;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		
		String expression = "(6+5*(2-8)/2)";
		
		int result = evaluate(expression);
		System.out.println(result);
	}
	
	// 중위표기식을 계산해주는 함수
	static int evaluate(String expression) {
		String postfix = infixToPostfix(expression);
		return evalPostfix(postfix);
	}
	
	private static int evalPostfix(String postfix) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String infixToPostfix(String expression) {
		// TODO Auto-generated method stub
		return null;
	}

	//우선순위와 괄호를 매치해주는 static block
	static Map<Character, Integer> map = new HashMap<>();

	static {
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
//		map.put('(', 0);
	}
	

}