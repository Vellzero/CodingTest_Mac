package m202202;
import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_11399_ATM_그리디_실버3_20220209{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N;i++) {
			arr[i] =sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int prev =0;
		int sum =0;
		
		for(int i=0; i<N; i++) {
			sum+= prev + arr[i];
			
			prev+= arr[i];
		}
		
		System.out.println(sum);
		
	}
	
}