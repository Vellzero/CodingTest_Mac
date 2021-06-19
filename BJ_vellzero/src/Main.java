import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		
		for ( int i= 1 ; i<A; i++){
			System.out.print(A);
			for(int j=1; j<B; j++) {
				System.out.print(B);
			}
		}
		
		System.out.println();
		sc.close();
		
	}
}