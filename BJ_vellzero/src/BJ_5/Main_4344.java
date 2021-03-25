package BJ_5;
import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		float [] num = new float [A];
		
		for(int i=0;i<A;i++) {
			float avg =0;
			float B = sc.nextInt();
			float [] num2 = new float [(int)B];
			
			float total = 0;
			float cnt =0;
			
			for( int j=0; j<B;j++) {
				num2[j] = sc.nextInt();
				total += num2[j];
			}

			avg = total/B;
			for (int j=0; j<B;j++) {
				if(num2[j]>avg) {
					cnt++;
				}else {
					continue;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/B)*100);
			total =0;
			cnt =0;
		}

		sc.close();
	}
}
