package BJ_문자열_202106.copy;
import java.util.Scanner;

public class Main_2675_문자열반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i = 0; i < A ; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			for(int j = 0; j < str.length() ; j++) {
				for(int k = 0; k < n; k++)
					System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		sc.close();
	}
}
