import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		
		int sum = fibonacci(N);
		System.out.println(sum);
		
		
	}
	public static int fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return fibonacci(N-1) + fibonacci(N-2) ;
	}
	
	
}