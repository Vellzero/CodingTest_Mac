package m202203.d09;
import java.util.Scanner;

public class Main_백준_17136_삼성A형_골드2_색종이붙이기_20220309 {
	static int[][] map = new int[10][10];
	static int[] paper = { 0, 5, 5, 5, 5, 5 };
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		DFS(0, 0, 0);

		if (ans == Integer.MAX_VALUE) {
			ans = -1;
		}
		System.out.println(ans);
	}

	public static void DFS(int x, int y, int cnt) {
		if (x >= 9 && y >= 9) {
			ans = Math.min(ans, cnt);
			return;
		}

		if (ans <= cnt) {
			return;
		}

		if (y > 9) {
			DFS(x + 1, 0, cnt);
			return;
		}

		if (map[x][y] == 1) {
			for (int i = 5; i >= 1; i--) {
				if (paper[i] > 0 && isAttach(x, y, i)) {
					attach(x, y, i, 0);
					paper[i]--;
					DFS(x, y + 1, cnt + 1);
					attach(x, y, i, 1);
					paper[i]++;
				}
			}
		} else {
			DFS(x, y + 1, cnt);

		}

	}

	// 색종이를 붙이는 함수
	public static void attach(int x, int y, int size, int state) {
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				map[i][j] = state;
			}
		}
	}

	// 색종이를 붙일 수 있는지 확인

	public static boolean isAttach(int x, int y, int size) {
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (i < 0 || i >= 10 || j < 0 || j >= 10) {
					return false;
				}
				if (map[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
}