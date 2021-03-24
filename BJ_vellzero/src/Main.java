import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long D = A*B*C;
		
		int [] num = new int [9];
		
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		sc.close();
	}
}
