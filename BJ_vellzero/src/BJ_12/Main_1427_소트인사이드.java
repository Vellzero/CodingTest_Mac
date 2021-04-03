package BJ_12;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main_1427_소트인사이드 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		char[] arr = sc.nextLine().toCharArray();
 
 
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();
 
	}
}