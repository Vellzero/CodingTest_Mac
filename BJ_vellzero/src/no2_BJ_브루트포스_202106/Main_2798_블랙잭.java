package no2_BJ_브루트포스_202106;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2798_블랙잭 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 뽑는 카드 갯
		int b = sc.nextInt(); // 총합계만들어야되는 수
		
		int [] card = new int[a];
		//System.out.println(Arrays.toString(card));
		
		for(int i=0;i<card.length;i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		//System.out.println(Arrays.toString(card));
		
		int sum=0;
		for(int i=0; i<a-2;i++) {
			for(int j=i+1;j<a-1;j++) {
				for(int k=j+1;k<a;k++) {
				
					int temp = card[i] + card[j] + card[k];
					
					if(b == temp) {
						sum = temp;
					}
					
					if(sum < temp&& temp < b) {
						sum = temp;
					}
					
				}
			}
			
		}
		
		System.out.println(sum);
		sc.close();
		
	}
}