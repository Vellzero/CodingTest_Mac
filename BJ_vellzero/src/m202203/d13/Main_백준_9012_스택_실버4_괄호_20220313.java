package m202203.d13;
import java.util.Scanner;
import java.util.Stack;

public class Main_백준_9012_스택_실버4_괄호_20220313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println(func(sc.next()));
		}

	}

	public static String func(String s) {

		Stack<Character> stack = new Stack<>();

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (c[i] == '(') {
				stack.push(c[i]);
			}

			else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}