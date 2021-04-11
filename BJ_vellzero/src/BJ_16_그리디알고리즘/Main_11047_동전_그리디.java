package BJ_16_그리디알고리즘;
import java.util.Scanner;
 
public class Main_11047_동전_그리디 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int [] arr = new int [N];
		              
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}  
		
		int count = 0;
		
		for(int i = N - 1; i >= 0; i--) {
			 
			// 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
			if(arr[i] <= K) {
				// 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
				count += (K / arr[i]);
				K = K % arr[i];
			}
		}
		              
		System.out.println(count);
		sc.close();
 
	}
}