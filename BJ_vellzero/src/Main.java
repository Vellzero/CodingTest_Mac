import java.util.Scanner;


public class Main{
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T;i++) {
			
			
			int [] arr = new int[10];
			int sum =0;
			
			for(int j=0; j<10;j++) {
				arr[j]= sc.nextInt();
			}
			
			for(int j=0; j<10; j++) {
				if(arr[j]%2!=0) {
					sum += arr[j];
				}
			}
			
			System.out.println("#" + i + " " + sum);
		}
	}
}