import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < K; i++) {
			int temp = sc.nextInt();
			if (temp != 0) {
				stack.push(temp);
			} else {
				stack.pop();
			}

		}

		int total = 0;
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			total += stack.pop();
		}
		System.out.println(total);
	}

}