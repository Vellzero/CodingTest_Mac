package BJ_11;
import java.util.Scanner;

public class Main_2231_분해합 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //주어지는수 = 분해
		int ans =0;
		
		for(int i=0; i<1000000;i++) {
			int number =i;
			int sum = 0;
			
			while(number!=0) {
				sum = sum + number%10;
				
				number = number/10;
			}
			
			if(sum + i == a) {
				ans = i;
				break;
			} 
		}
		
		System.out.println(ans);
		sc.close();
		
	}
}