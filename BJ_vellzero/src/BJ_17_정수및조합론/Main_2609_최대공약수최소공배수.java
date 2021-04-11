package BJ_17_정수및조합론;
import java.util.Scanner;
 
public class Main_2609_최대공약수최소공배수 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
 
		int d = gcd(a, b);	// 최대공약수
 
		System.out.println(d);
		System.out.println(a * b / d);
 
	}
 
	// 최대공약수 재귀 방식
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
            
		// GCD(a, b) = GCD(b, r)이므로 (r = a % b)
		return gcd(b, a % b);
	}
}