import java.util.Scanner;
public class Solution{
	
	public static void main(String[] args) throws Exception {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			
			
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
			
			System.out.println("#" + test_case + " " + sum);
		}
	}
}