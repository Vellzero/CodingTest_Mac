package BJ_8;
import java.util.Scanner;
 
public class Main_2292_hard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int a = sc.nextInt();
		
		int num = 1;
		int range = 1;
		int result = 1;
		
		while(true) {
			if(a <= range) {
				break;
			}
			result ++;
			range += 6 * num;
			num ++;
		}
		
		System.out.println(result);
		
		sc.close();
	
				
 
	}
 
}