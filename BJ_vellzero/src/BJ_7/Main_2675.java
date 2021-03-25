package BJ_7;
import java.util.Scanner;

public class Main_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N ; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			for(int j = 0; j < str.length() ; j++) {
				for(int k = 0; k < n; k++)
					System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}