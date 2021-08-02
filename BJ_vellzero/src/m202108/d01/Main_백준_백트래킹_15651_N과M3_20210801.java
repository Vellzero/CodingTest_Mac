package m202108.d01;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main_백준_백트래킹_15651_N과M3_20210801 {
 
	public static int[] arr;
	public static int N,M;
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		dfs(0);
		sc.close();
	}
	
	public static void dfs(int depth) {
		
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i =1; i<=N; i++) {
			arr[depth] = i;
			dfs(depth +1);
			
 		}
			
	}
		
	
}
