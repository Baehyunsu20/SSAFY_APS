package SWEA_1251_하나로_크루스칼;


import java.util.*;
import java.io.*;

public class Solution {
	
	static int[] rep;
	static int[][] island;
	static long[][] distance; //거리들의 
	static int n; //섬 개수
	static int m; //모든 간선 개수 
	
	public static void main(String[] args) throws FileNotFoundException {
			Scanner sc = new Scanner(new File("input_하나로.txt"));
			int T = sc.nextInt();
			
			for(int t=1; t<=T; t++) {
				n=sc.nextInt();
				m=n*(n-1)/2; // nC2 : 2개를 조합으로 뽑을 수 있는 경우의 수.
				
				island = new int[][2]; //x,y값만 받을것이므로 2까지를 범위로
				for(int i=0; i<n; i++) {
					island[i][0] = sc.nextInt();
					island[i][1] = sc.nextInt();
				}
				double e = sc.nextDouble(); //세율을 입력 받음
				
				//대표섬 설정 : 초기는 자신 idx를 대표섬으로 설정
				rep = new int[n]; // 각 섬별 대표섬을 설정.
				for(int i=0; i<n; i++) {
					rep[i] = i; //자신의 인덱스를 대표자로 설정
				}
				
				//가능한 모든 간선에 대한 연결 / 0=섬1/ 1=섬2 / 2=섬간의 거리
				distance = new long[m][3];
				int idx = 0;
				for(int i=0; i<n-1; i++) {
					for(int j=i; j<n; j++) {
						distance[idx][0] = i;
						distance[idx][0] = j;
						long CalDistance = (long)(Math.pow(island[i][0]-island[j][0],2) + Math.pow(island[i][1]-island[j][1], 2)); //거리제곱.
						if(CalDistance <0) CalDistance = Long.MAX_VALUE; //오버플로우가 일어나면 음수로 감.
						//마지막 요소 = 섬 간의 거리 입력
						distance[idx++][2] = CalDistance;
					}
				}
				
				//가중치 오름차순 -> 거리별 오름차순 : 람다식의 표현법
				Arrays.sort(distance, (a, b) -> Long.compare(a[2], b[2])); //(a,b) : 2차원 배열을 의미. //2차원 배열에서 
				
				
				
				
				
				
			}
	}
	

}
