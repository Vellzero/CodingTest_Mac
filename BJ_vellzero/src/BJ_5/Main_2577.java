package BJ_5;
import java.util.Scanner;

public class Main_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long D = A*B*C;
		
		int [] num = new int [10];
		
		long rest =0;
		while(D>0) {
			rest = (D %10);
			D = D/10;
			num[(int)rest]++;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		sc.close();
	}
}
