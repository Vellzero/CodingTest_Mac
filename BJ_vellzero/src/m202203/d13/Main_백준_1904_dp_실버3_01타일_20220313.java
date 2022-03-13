package m202203.d13;
import java.util.Scanner;

public class Main_백준_1904_dp_실버3_01타일_20220313 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		long[] dp = new long[1000001];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
		}

		System.out.println(dp[N]);

	}

}