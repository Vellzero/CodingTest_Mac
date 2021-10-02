package m202110;
import java.util.Scanner;

public class Main_백준_10872_팩토리얼_재귀_브론즈3_20211002{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int sum = factorial(N);
		System.out.println(sum);
		sc.close();
		
	}
	public static int factorial(int N) {
		if(N <=1) return 1;
		return N *factorial(N-1);
	}
	
	
}