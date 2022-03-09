import java.util.Scanner;

public class Main {
	static int N, M;

	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[M + 1];
		visited = new boolean[N + 1];
		dfs(N, M, 1);

	}

	public static void dfs(int N, int M, int depth) {
		if (depth == M + 1) {
			for (int i = 1; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				arr[depth] = i;
				dfs(N, M, depth + 1);
				visited[i] = false;

			}
		}

	}
}