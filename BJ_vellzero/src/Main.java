
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), "-");
		
		while (st.hasMoreTokens() ) {
			int temp =0;
			
			StringTokenizer add = new StringTokenizer(st.nextToken() , "+");
			while (add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}