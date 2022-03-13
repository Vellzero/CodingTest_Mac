package m202203.d13;
import java.util.Scanner;

public class Main_백준_1003_DP_실버3_피보나치함수_dp로풀기_20220313 {

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

		int temp1 = 0;
		int temp2 = 1;
		int temp = 0;

		if (n == 0) {
			num0++;
		} else if (n == 1) {
			num1++;
		} else {
			for (int i = 1; i < n; i++) {
				temp = temp1 + temp2;
				temp1 = temp2;
				temp2 = temp;
			}
			num0 = temp1;
			num1 = temp2;

		}

	}
}