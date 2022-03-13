package m202203.d13;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_11866_큐_실버4_요세푸스_20220313 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		int N = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		System.out.print("<");
		while (q.size() > 1) {
			for (int i = 0; i < K - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}

			System.out.print(q.poll() + ", ");

		}
		System.out.print(q.poll());
		System.out.print(">");

	}

}