package BJ_5;
import java.util.Scanner;

public class Main_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int[] arr = new int[A];
		
		
		for(int i=0; i<A; i++) {
			int B = sc.nextInt();
			arr[i] = B;
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for (int i=1; i<A; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			else if(max<arr[i]){
				max = arr[i];
			} else {
				continue;
			}
		
		}
		
		System.out.print(min+" ");
		System.out.print(max);
		sc.close();
	}
}
