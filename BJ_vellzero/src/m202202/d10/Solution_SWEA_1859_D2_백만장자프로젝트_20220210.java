package m202202.d10;
import java.util.Scanner;
public class Solution_SWEA_1859_D2_백만장자프로젝트_20220210{
	
	public static void main(String[] args) throws Exception {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			
			int A = sc.nextInt();
			int [] arr = new int[A];
			
			for(int j=0; j<A;j++) {
				arr[j]= sc.nextInt();
			}
			
			long sum =0;
			
			long max = arr[A-1];
			for(int j= A-2; j>=0; j--) {
				
				if(arr[j] < max) {
					sum += max - arr[j];
				}else {
					max = Math.max(arr[j], max);
				}
					
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
	}
}