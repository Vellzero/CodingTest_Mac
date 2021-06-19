import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
		
		factorial(A);
		sc.close();
	}
	
	public static void factorial(int n) {
		int sum = 1;
		for(int i=1;i<n;i++) {
			sum = sum * i;
		}
 
		System.out.print(sum);
	}
 
}