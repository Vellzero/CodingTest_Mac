package BJ_5;
import java.util.Scanner;

public class Main_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A =0;
		
		
		int [] num = new int [42];
		
		int rest =0;
		int gatsu =0;
		for(int i=0;i<10;i++) {
			A = sc.nextInt();
			rest = A%42;
			num[rest]++;
			
		}
		
		for(int i=0;i<42;i++) {
			if(num[i]!=0) {
				gatsu++;
			}
		}
		
		System.out.println(gatsu);
		sc.close();
	}
}
