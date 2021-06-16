package BJ_1차원배열_202106;
import java.util.*;

public class Main_10818_최대최소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int a = sc.nextInt();
		int[] arr= new int [a];
		
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.print(arr[0] + " " + arr[a - 1]);
		
		
		sc.close();
	}
	
}