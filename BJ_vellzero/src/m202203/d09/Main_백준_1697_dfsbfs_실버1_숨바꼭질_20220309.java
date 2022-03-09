package m202203.d09;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1697_dfsbfs_실버1_숨바꼭질_20220309 {

	static int N;
	static int K;

	static int[] map;
	static int[] visited = new int[100001];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		int result = bfs(N);
		System.out.println(result);
	}

	public static int bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(node);
		int index = node;
		int n = 0;
		visited[index] = 1;

		while (!queue.isEmpty()) {
			n = queue.poll();

			if (n == K) {
				return visited[n] - 1;
			}
			if (n - 1 >= 0 && visited[n - 1] == 0) {
				visited[n - 1] = visited[n] + 1;
				queue.add(n - 1);
			}
			if (n + 1 <= 100001 && visited[n + 1] == 0) {
				visited[n + 1] = visited[n] + 1;
				queue.add(n + 1);
			}
			if (2 * n <= 100001 && visited[2 * n] == 0) {
				visited[2 * n] = visited[n] + 1;
				queue.add(2 * n);
			}
		}

		return -1;

	}

}
