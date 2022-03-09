package m202203.d09;
import java.util.Scanner;

public class Main_백준_14888_백트래킹_실버1_연산자끼워넣기_20220309 {
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static int N;
	static int[] arr;
	static int[] oper = new int[4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			oper[i] = sc.nextInt();
		}

		DFS(arr[0], 1);

		System.out.println(MAX);
		System.out.println(MIN);

	}

	public static void DFS(int num, int index) {
		if (index == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}

		for (int i = 0; i < 4; i++) {
			// 연산자 개수가 1개 이상인 경우
			if (oper[i] > 0) {
				oper[i]--;

				// 덧셈
				if (i == 0) {
					DFS(num + arr[index], index + 1);
				}

				// 뺄셈
				else if (i == 1) {
					DFS(num - arr[index], index + 1);
				}

				// 곱셈
				else if (i == 2) {
					DFS(num * arr[index], index + 1);
				}

				// 나눗셈
				else {
					DFS(num / arr[index], index + 1);
				}

				oper[i]++;
			}
		}

	}
}