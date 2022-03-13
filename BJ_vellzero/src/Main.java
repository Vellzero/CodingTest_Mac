import java.util.Scanner;

public class Main {

	static int num0 = 0;
	static int num1 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < T; i++) {
			fibonacci(arr[i]);
			System.out.print(num0 + " " + num1);
			num0 = 0;
			num1 = 0;
			System.out.println();

		}

	}

	public static void fibonacci(int n) {

		if (n == 0) {
			num0++;
		} else if (n == 1) {
			num1++;
		} else {
			fibonacci(n - 1);
			fibonacci(n - 2);

		}

	}
}