package SWEA_3499_퍼펙트셔플;
import java.util.*;
/**
 * 카드를 절반을 나누고(인풋으로 들어온 숫자 N을 반으로 나눔)
 * 중첩클래스를 사용함 -> 하지만 역량 테스트에서는 사용 하지 않는 것을 권장한다.
 */

public class Solution2 {
	static Scanner sc = new Scanner(System.in);
	static int T = sc.nextInt();
	//범위가 1부터 1000까지 가능 = 최대 배열의 크기 = 1000
	//반으로 나눠서 진행
//	static String[] queue1 = new String[500];
//	static int front1 = -1;
//	static int rear1 = -1;
//	
//	static String[] queue2 = new String[500];
//	static int front2 = -1;
//	static int rear2 = -1;
	
	public static void main(String[] args) {
		
//		for(int t=1; t<=T; t++) {
//			int cardNum = sc.nextInt();
//			//queue1에 쌓일 카드의 수
//			int num = cardNum/2;
//			
//			//queue1에 쌓일 카드의 수
//			int res = cardNum - num;
//			
//			
//			
//			String[] queue1 = new String[500];
//			int front1 = -1;
//			int rear1 = -1;
//			
//			String[] queue2 = new String[500];
//			int front2 = -1;
//			int rear2 = -1;
//			
//			//q1에 쌓일 카드의 스택
//			for(int i=0; i<num; i++) {
//				int front = front1;
//				int rear = rear1;
//				String[] tmp = sc.next().split(" ");
//				String word = tmp[0];
//				enQueue(queue1, word, front, rear);
//				
//			}
//			
//			//q2에 쌓일 카드의 수
//			for(int i=0; i<res; i++) {
//				int front = front2;
//				int rear = rear2;
//				//split을 해도 단어로 들어오는게 아닌 배열[]로 들어온다.
//				String[] tmp = sc.next().split(" ");
//				String word = tmp[0];
//				enQueue(queue2, word, front, rear);
//				
//			}
//			//절반씩 각 큐에 들어감.
//			//이제 한개씩 배출
//			System.out.print("#"+t+" ");
//			 for(int time=1; time <= cardNum; time++) {
//				 if(!(time%2==0)) {
//					 //time이 홀수 일때,  q1에서 dq
//					String tmp =  deQueue(queue1, front1, rear2);
//					System.out.print(tmp+" ");
//					 
//				 }
//				 else {
//					 //time이 짝수일때, q2에서 dq
//					String tmp =  deQueue(queue2, front2, rear2);
//					System.out.print(tmp+" ");
//				 }
//			 }
//			
//			
//			
//			
//			
//			
//		}
//		
//	}
		
		for (int t = 1; t <= T; t++) {
            int cardNum = sc.nextInt();
            int num = cardNum / 2 ;
            int res = cardNum - num ;

            Queue queue1 = new Queue(500);
            Queue queue2 = new Queue(500);

            for (int i = 0; i < res; i++) {
                String word = sc.next();
                queue1.enQueue(word);
            }

            for (int i = 0; i < num; i++) {
                String word = sc.next();
                queue2.enQueue(word);
            }

            System.out.print("#" + t + " ");
            for (int time = 1; time <= cardNum; time++) {
                if (time % 2 != 0) {
                    String tmp = queue1.deQueue();
                    System.out.print(tmp + " ");
                } else {
                    String tmp = queue2.deQueue();
                    System.out.print(tmp + " ");
                }
            }
            System.out.println();
        }
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

		
//	
//	static boolean isEmpty() {
//		return front==rear;
//	}
//	
//	static boolean isFull(String[] queue, int front, int rear) {
//		return rear==queue.length -1 ;
//	}
//	
//
//	//삽입
//	//front와 rear를 따로 입력 받아도 메서드는 값을 복사하는 것이기 때문에 실제 front, rear에는 적용이 안된다.
//	private static void enQueue(String[] queue, String word, int front, int rear) {
//		if(isFull(queue, front, rear)) {
//			//배열이 다 차있으면 
//			return;
//		}
//		System.out.println(word + "값을 삽입합니다.");
//		queue[++rear]=word;
//		System.out.println(Arrays.toString(queue));
//		
//		
//	}
//	
//	static String deQueue(String[] queue, int front, int rear) {
//		if(isEmpty(queue, front, rear)) {
//			return null;
//		}
//		return queue[++front];
//		
//	}
	
	
	static class Queue {
	    String[] queue;
	    int front;
	    int rear;

	    public Queue(int size) {
	        queue = new String[size];
	        front = -1;
	        rear = -1;
	    }

	    boolean isEmpty() {
	        return front == rear;
	    }

	    boolean isFull() {
	        return rear == queue.length - 1;
	    }

	    void enQueue(String word) {
	        if (isFull()) {
	            // 배열이 다 차있으면
	            return;
	        }
	        queue[++rear] = word;
	    }

	    String deQueue() {
	        if (isEmpty()) {
	            return null;
	        }
	        return queue[++front];
	    }
	}

	
	
	
	

	
	
	

}