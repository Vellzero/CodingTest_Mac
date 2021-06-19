package no2_BJ_문자열_202106;
import java.util.Scanner;

public class Main_11720_숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int A = sc.nextInt();
		String B = sc.next();
		
		int sum =0;
		for(int i=0; i<A; i++) {
			sum += B.charAt(i)-48;
		}
		
		System.out.println(sum);
		sc.close();
	}
	
}