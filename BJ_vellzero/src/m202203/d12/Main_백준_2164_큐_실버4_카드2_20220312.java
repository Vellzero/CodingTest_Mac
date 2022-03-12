package m202203.d12;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2164_큐_실버4_카드2_20220312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		while (queue.size() > 1) {

			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}
}