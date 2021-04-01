package BJ_10;
import java.util.Scanner;
 
public class Main_10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int a = sc.nextInt();
		
		
		System.out.println(fibonacci(a));
		sc.close();
		
	}
	static int fibonacci(int n) {
		
		if( n==0) return 0;
		if( n==1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
		
	}
 
}