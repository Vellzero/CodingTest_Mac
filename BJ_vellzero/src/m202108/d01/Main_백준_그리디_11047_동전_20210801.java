package m202108.d01;
import java.util.Scanner;

public class Main_백준_그리디_11047_동전_20210801 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int [] arr =  new int [A];
		
		for(int i=0; i<A; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count =0; 
		
		for(int i=A-1; i >=0 ; i--) {
			if(arr[i] <=B) {
				count += (B/ arr[i]);
				B = B % arr[i]; 
				System.out.println(B);
						
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}