package BJ_12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_2751_수정렬하기2 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int a = sc.nextInt(); 
		
		ArrayList <Integer> arr = new ArrayList<>();
		
		for(int i=0;i<a;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int value : arr) {
			//System.out.println(value);
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		sc.close();
	}
}