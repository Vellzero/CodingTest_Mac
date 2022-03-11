package m202203.d11;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_민코딩_adv사전_액체괴물놀이_20220311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[] arr = new long[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		PriorityQueue<Long> queue = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
		}

		long Sum = 0;
		long temp = 0;

		while (queue.size() >= 2) {
			long A = queue.poll();
			long B = queue.poll();

			temp = A + B;
			Sum += temp;
			queue.add(temp);
		}

		System.out.println(Sum);
	}
}