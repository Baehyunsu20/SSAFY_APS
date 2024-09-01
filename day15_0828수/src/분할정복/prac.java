package 분할정복;
/**
 * 거듭제곱 구하기
 */
public class prac {
	static int n,k;
	public static void main(String[] args) {
		n=2;
		k=5;
		System.out.println(div(2,5));
	}
	private static int div(int n, int k) {
		if(k==1) {
			return n;
		}
		
		if(k%2 == 0) {
			int tmp = div(2,k/2);
			return tmp*tmp;
		}
		else {
			int tmp = div(2, k/2);
			return tmp*tmp*n;
		}
	}

}
