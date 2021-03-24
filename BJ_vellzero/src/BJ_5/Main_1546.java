package BJ_5;
import java.util.Scanner;

public class Main_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		double [] num = new double [A];
		double PG =0;
		double chongjum =0;
		double MAX = num[0];
		
		for(int i=0;i<A;i++) {
			int B = sc.nextInt();
			num[i] =B;
		}
		for(int i=0;i<A;i++) {
			if(MAX<=num[i]){
				MAX = num[i];
			}
		}
		
		for(int i=0;i<A;i++) {
			
			num[i]= ((num[i]/MAX)*100);
			
			chongjum =chongjum + num[i];
		}
		
		PG = chongjum/A;
		
		System.out.println(PG);
		sc.close();
	}
}
