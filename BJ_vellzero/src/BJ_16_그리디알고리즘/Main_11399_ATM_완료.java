package BJ_16_그리디알고리즘;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main_11399_ATM_완료 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int [] line = new int[A];
		
		for(int i=0; i<A;i++) {
			line[i] = sc.nextInt();
		}
		
		Arrays.sort(line);
		
		int sum =0;
		int prev =0;

		for(int i=0; i<A;i++) {
			
			sum += prev +line[i];
			prev += line[i];
		}
			
		
		
		System.out.println(sum);
		sc.close();
	}
	

}