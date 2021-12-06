package m202112;
import java.util.Scanner;

public class Main_백준_10872_팩토리얼_브론즈3_재귀_20211206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int X = fibonacci(A);
		
		System.out.println(X);
	}

	public static int fibonacci(int B) {
		
		if(B <=1 ) {
			return 1;
		}
		else {
			int C = B * fibonacci(B-1);
			return C;
		}
		
	}
}
