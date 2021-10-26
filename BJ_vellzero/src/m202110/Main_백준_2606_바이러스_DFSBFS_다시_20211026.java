package m202110;
import java.util.Scanner;

public class Main_백준_2606_바이러스_DFSBFS_다시_20211026{
	
	static int N;
	static int M;
	
	static int[][] map;
	static boolean[]visit;
	
	static int count =0;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		
		for(int i=0; i<M;i++) {
			
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			map[a][b] = map[b][a] =1;
		}
		
		dfs(1);
		System.out.println(count);
		sc.close();
		
	}
	public static void dfs(int i) {

		visit[i] = true;
	
		for(int j=1;j<=N;j++) {
			if(map[i][j] == 1 && visit[j] ==false) {
				count++;
				dfs(j);
			}
			
		}
	}
}