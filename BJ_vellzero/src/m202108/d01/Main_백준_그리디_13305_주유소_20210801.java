package m202108.d01;
import java.util.Scanner;
 
public class Main_백준_그리디_13305_주유소_20210801 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		long [] dist = new long[A-1];
		long [] price = new long[A];
		
		long sum =0;
		
		for(int i=0;i<A-1;i++) {
			dist[i]= sc.nextInt();
		}
		
		for(int i=0;i<A;i++) {
			price[i]= sc.nextInt();
		}
 
		long minCost = price[0];	// 이전 까지의 과정 중 주유 최소 비용 
		 
		for(int i = 0; i < A - 1; i++) {
			
			/*
			 *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 *  minCost를 갱신해준다. 
			 */
			if(price[i] < minCost) {
				minCost = price[i];
			}
			
			sum += (minCost * dist[i]);	// 총 비용 누적 합
		}
		
		System.out.println(sum);
		sc.close();
	}
 
}