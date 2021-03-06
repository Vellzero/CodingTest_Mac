package m202112;
 import java.util.Scanner;
 
public class Main_백준_15649_N과M_실버3_백트래킹_20211206 {
 
	public static int[] arr;
	public static boolean[] visit;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		in.close();
	}
 
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int i=0; i<M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}