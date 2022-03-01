package m202203.d01;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2667_dfsbfs_실버3_단지번호붙이기_bfs로풀기_20220301 {

	static int N;

	static int[][] map;
	static boolean[][] visited;

	static int Num;
	static int[] apartNum = new int[25 * 25];

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String sb = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = sb.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && visited[i][j] == false) {
					Num++;
					BFS(i, j);
				}
			}
		}
		Arrays.sort(apartNum);
		System.out.println(Num);

		for (int i = 0; i < apartNum.length; i++) {
			if (apartNum[i] == 0) {
			} else {
				System.out.println(apartNum[i]);
			}

		}

	}

	public static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });
		visited[x][y] = true;
		apartNum[Num]++;

		while (!queue.isEmpty()) {

			int curX = queue.peek()[0];
			int curY = queue.peek()[1];
			queue.poll();

			for (int i = 0; i < 4; i++) {

				int nx = curX + dx[i];
				int ny = curY + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (map[nx][ny] == 1 && visited[nx][ny] == false) {
						queue.add(new int[] { nx, ny });
						visited[nx][ny] = true;
						apartNum[Num]++;
					}
				}

			}

		}

	}

}