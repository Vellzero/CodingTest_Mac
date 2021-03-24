package BJ_2;
import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>=1) {
			if(B >= 45) {
				B = B - 45;
				System.out.println(A +" "+ B);
			} else {
				A= A-1;
				B = B + 15;
				System.out.println(A + " " + B);
			}
			
		}else {
			if(B >= 45) {
				B = B - 45;
				System.out.println(A +" "+ B);
			} else {
				A = A + 23;
				B = B + 15;
				System.out.println(A + " " + B);
			}
		}

		sc.close(); 
		
		  
	}
}
