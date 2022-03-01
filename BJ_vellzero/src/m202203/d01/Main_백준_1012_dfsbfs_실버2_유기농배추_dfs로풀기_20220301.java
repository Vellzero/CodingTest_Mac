package m202203.d01;
import java.util.Scanner;

public class Main_백준_1012_dfsbfs_실버2_유기농배추_dfs로풀기_20220301 {

	static int T;
	static int M;
	static int N;
	static int K;

	static int[][] map;
	static boolean[][] visited;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int Num = 0;
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();

			map = new int[N][M];
			visited = new boolean[N][M];

			for (int j = 0; j < K; j++) {
				int A = sc.nextInt();
				int B = sc.nextInt();

				map[A][B] = 1;
			}

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (map[j][k] == 1 && visited[j][k] == false) {
						DFS(j, k);
						// BFS(j,k);
						Num++;
					}
				}
			}
			System.out.println(Num);
		}
	}

	public static void DFS(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if (map[nx][ny] == 1 && visited[nx][ny] == false) {
					DFS(nx, ny);
				}
			}
		}
	}

}
