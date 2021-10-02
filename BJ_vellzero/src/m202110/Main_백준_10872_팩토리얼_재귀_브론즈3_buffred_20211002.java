package m202110;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_10872_팩토리얼_재귀_브론즈3_buffred_20211002{
	
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
		
		
	}
	public static int factorial(int N) {
		if(N <=1) return 1;
		return N *factorial(N-1);
	}
	
	
}