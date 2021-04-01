package BJ_10;
import java.util.Scanner;
 
public class Main_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int a = sc.nextInt();
		
		factorial(a);
		sc.close();
	}
	public static void factorial(int n) {
		int a=1;
		for ( int i = 1; i<=n;i++) {
			
			a = a * i;
		}
		
		System.out.println(a);
		
	}
 
}