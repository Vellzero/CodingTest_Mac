
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < T; i++) {

			if (arr[i] == 0) {
				if (pq.isEmpty()) {
					pq.poll();
					System.out.println("0");
				} else {
					System.out.println(pq.poll());
				}
			}

			else {
				pq.add(arr[i]);
			}

		}

	}
}