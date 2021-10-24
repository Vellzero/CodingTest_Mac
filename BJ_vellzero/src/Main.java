import java.util.Scanner;
 
public class Main {
	
	public static int N;
	public static int M;
	
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(0);
		sc.close();
	}
	public static void dfs(int depth) {
		if(depth == M) {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				visit[i] =false;
			}
		}
		
	}
}




