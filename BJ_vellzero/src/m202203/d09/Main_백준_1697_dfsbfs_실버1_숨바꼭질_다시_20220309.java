package m202203.d09;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1697_dfsbfs_실버1_숨바꼭질_다시_20220309 {

	static int N;
	static int K;

	static int[] visited = new int[100001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		if (N == K) {
			System.out.println(0);
		} else {
			BFS(N);
		}
	}

	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(node);
		visited[node] = 1;

		while (!queue.isEmpty()) {
			int temp = queue.poll();

			for (int i = 0; i < 3; i++) {
				int next = 0;

				if (i == 0) {
					next = temp + 1;
				}
				if (i == 1) {
					next = temp - 1;
				}
				if (i == 2) {
					next = temp * 2;
				}

				if (next == K) {
					System.out.println(visited[temp]);
					return;
				}

				if (next >= 0 && next < visited.length && visited[next] == 0) {
					queue.add(next);
					visited[next] = visited[temp] + 1;
				}

			}

		}

	}

}