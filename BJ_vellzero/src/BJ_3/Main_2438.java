package BJ_3;
import java.util.Scanner;

public class Main_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i=1; i<=A; i++) {
			for( int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		sc.close(); 
	}
}
