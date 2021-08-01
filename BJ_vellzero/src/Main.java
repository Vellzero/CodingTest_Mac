import java.util.Arrays;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		
		int arr [] = new int [A];
		
		for(int i =0; i<A; i++) {
			arr [i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum =0;
		int pre =0;
		for(int i=0; i<A;i++) {
			sum += pre + arr[i];
			pre += arr[i];
					
		}
		
		
		
		System.out.println(sum);
		
		sc.close();
	}
}