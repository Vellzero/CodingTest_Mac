package BJ_3;
import java.util.Scanner;

public class Main_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i=0; i<A; i++) {
			int C = sc.nextInt();
			if(C < B) {
				System.out.print(C +" ");
			}
		}
		sc.close(); 
	}
}
