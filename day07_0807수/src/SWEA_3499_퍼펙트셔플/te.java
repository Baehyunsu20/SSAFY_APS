package SWEA_3499_퍼펙트셔플;

import java.util.Arrays;
import java.util.Scanner;

public class te {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for(int i =0; i<4;i++) {
			//한글자씩 들어옴.
			String[] tt = sc.next().split(" ");
			System.out.println(Arrays.toString(tt));
			System.out.println("size : "+ tt.length);
			
		}
		
	}

}
