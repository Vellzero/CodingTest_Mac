package no2_BJ_문자열_202106;
import java.util.Scanner;

public class Main_10809_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		
        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(A.indexOf(c) + " ");

	}
}
