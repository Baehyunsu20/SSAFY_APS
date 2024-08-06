import java.util.Arrays;

/**
 * 스택의 구현
 * push, pop, peek, empty(Full), top 구현
 * 
 * - push : 정수 X를 스택에 넣음
 * - pop : 가장 위에 있는 수를 빼고, 그 수를 출력, 스택에 들어있는 정수가 없다면 -1 출력
 * - size : 스택에 들어있는 정수의 개수를 출력한다
 * - empty : 스택이 비어있으면 1, 아니면 0을 출력한다
 * - top : 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * 배열을 통한 스택의 구현 -> List도 가능(해봐야지)
 */

public class 스택구현1 {
	
	//1. 먼저 데이터를 담을 리스트만들기  
		//최대 크기를 100으로 지정->스택의 사이즈와는 관계없음(스택의 사이즈는 top으로 정해짐)
	static String[] stack = new String[10];
	static int top = -1;
	public static void main(String[] args) {
		push("고양이");
		System.out.println(Arrays.toString(stack));
		push("강아지");
		System.out.println(Arrays.toString(stack));
		peek();
		System.out.println(peek());
		
		while(!(isFull())) {
			//WHILE의 조건문을 만족할 때까지만 실핼
			push("있다");
		}
		System.out.println(Arrays.toString(stack));

	}
	
	
	
	/* isEmpty : 스택이 비어있는지 확인
	 * 스택이 비어있으면 0(true), 스택 안에 요소가 있다면 1(false)
	 */
	static boolean isEmpty(){
//		if(top==-1)return true;//-1 : 비어있으면  true.
//		return false;				: 값이 있으면 false.
		
		//top이 -1일때 반환값이 있게 할 수 있다. 
		//(top==1) 조건을 만족하면 true  반환 , 만족 하지않으면 false 반환 
		return top==-1;
	}
	
	//스택이 가득 차있는냐를 판단
	static boolean isFull() {
		//인덱스는 하나 작으니까, 
		//stack의 최대 인덱스 = stack.length - 1
		//최대이다 = 조건을 만족한다 -> true 반환
		//조건을 만족하지않는다 ->  false
		return top == stack.length -1;
	}
	
	static void push(String item) {
		//void : 반환값이 없는 method,  반환값을 지정하먼 에러나더라
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다");
			return;
		}
		stack[++top]=item;
	}
	
	static String pop() {
		//비어있는 경우를 고려
		if(isEmpty()) {
			//값이 비어있는 것이 true일 때,
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		//stack list가 전역변수이기에 가능. 반환해주고 꼭짓점-1해주어 스택의 사이즈 줄이기
		return stack[top--];	
	}
	
	//현 스택의 최고치를 반환해줌
	static String peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		return stack[top];
		
	}
	
	
	
	

}
