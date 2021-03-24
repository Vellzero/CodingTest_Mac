package BJ_5;
import java.util.Scanner;

public class Main_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		
		for(int i=0; i<9; i++) {
			int B = sc.nextInt();
			arr[i] = B;

		}
		
		int max=arr[0];
		int imax =0;
		for (int i=0; i<9; i++) {
			if(max<=arr[i]){
				max = arr[i];
				imax =i+1;
			}else {
				continue;
			}
		
		}
		
		System.out.println(max);
		System.out.println(imax);
		sc.close();
	}
}
