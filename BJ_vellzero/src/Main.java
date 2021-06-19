import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
		
		System.out.print(fibo(A));
	
		sc.close();
	}
	
	public static int fibo(int n) {
		
		if( n==0) return 0;
		if( n==1) return 1;
		
		return fibo(n-1) + fibo(n-2);
		
	}
 
}