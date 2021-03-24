package BJ_4;
import java.util.Scanner;

public class Main_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = A;
		int n =0;
		
		while(true) {
		
			
			A = (((A%10)*10)+(((A/10)+(A%10))%10));
			
			n++;
			
			if(A == B) {
				break;
			}
			
			
		}
		System.out.println(n);
		sc.close();
	}
}
