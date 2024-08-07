package Queue1;

//import java.util.LinkedList;
import java.util.*;

/**
 * 큐의 구현 : isEmpty , isFull, enQueue, deQueue, Qpeek, size로 직접 구현해보기
 * 배열로도하고, LinkedList는 구현체로 사용
 */

public class Solution {
	static String[] queue = new String[10];
	static Scanner sc = new Scanner(System.in);
	static int front  = -1;
	static int rear = -1;
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			enQueue("good");
		}//크기 10이 다 차버림
		
		System.out.println(size());
		
		while (!isEmpty()) {
			String rItem = deQueue();
			String peek = Qpeek();
			System.out.println(rItem+" peek : "+peek);
//			System.out.println();
		}//조건문이 만족할 때 까지 -> 비어있으면 무한루프 탈출
		
		//비어있는 큐.
		deQueue();
		
		
	}
	
	//1.  배열이 비어있는지 확인
	static boolean isEmpty() {
		return front==rear;
	}
	
	//2. 배열이 가득 차 있는지 확인 -> 동적 배열에서는 고려해주지 않아도 되긴함 -> 뒤로 인덱스가 밀려서 메모리 비효율
	//-> 동적배열을 사용하지말아야겠다.
	static boolean isFull() {
		return rear == queue.length -1;
	}
	
	//3. 값 삽입, enQueue
	static void enQueue(String tmp) {
		//배열이 꽉 차지 않은 상태일 때
		if(isFull()) {
			System.out.println("배열이 한계에 달했습니다.");
		}
		//rear 기존에 가장 최근에 들어온 값
		//그러므로 한칸을 늘려주고 그 공간에 입력값을 넣어줌.
		queue[++rear]=tmp;
	}
	
	//4. 값 삭제, deQueue
	static String deQueue() {
		if(isEmpty()) {
			System.out.println("배열이 비어있는데요?");
			return null;
		}
		//front +1의 인덱스를 가진 값이 반환, front 또한 1 커진다.
		//queue[front + 1] 가 반환되고, front++  -> queue[++front]로 치환가능 
		return queue[++front];
	}
	
	static int size() {
		return rear-front;
	}
	
	//삭제할 원소 = Qpeek ; front +1의 인덱스 요소
	static String Qpeek() {
		if(isEmpty()) {
			return null;
		}
		return queue[front +1];
	}
	
	

}