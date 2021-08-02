package m202108.d01;

import java.util.Scanner;
 
public class Main_백준_백트래킹_15652_N과M4_20210801 {
 
	public static int[] arr;
	public static int N,M;
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		dfs(1, 0);
		sc.close();
	}
	
	public static void dfs(int A, int depth) {
		
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i =A; i<=N; i++) {
			arr[depth] = i;
			dfs(i, depth +1);
			
 		}
			
	}
		
	
}
