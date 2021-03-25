package BJ_5;
import java.util.Scanner;

public class Main_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String [] num = new String [A];
		
		for(int i=0; i<num.length;i++) {
			int count =0;
			int sum =0;
			
			num[i] =sc.next();
			
			for(int j=0; j<num[i].length();j++) {
				if(num[i].charAt(j)=='O') {
					sum += ++count;
				}else {
					count =0;
				}
			}
			System.out.println(sum);
		}
		

		sc.close();
	}
}
