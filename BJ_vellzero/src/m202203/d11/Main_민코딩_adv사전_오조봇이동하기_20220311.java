package m202203.d11;
import java.util.Scanner;

public class Main_민코딩_adv사전_오조봇이동하기_20220311 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String T = sc.next();
		char[] arr = T.toCharArray();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == '>') {

				for (int j = i; j < arr.length; j++) {
					if (arr[j] == '<') {
						count--;
						break;
					}
				}
				count++;
			} else {
				for (int j = i; j >= 0; j--) {

					if (arr[j] == '>') {
						count--;
						break;
					}
				}
				count++;
			}

		}
		System.out.println(count);
	}
}
//<<<<><//