package m202202.d27;
import java.util.Scanner;

public class Main_백준_2606_실버3_DFSBFS_바이러스_20220227{
	
	static int N;
	static int M;
	
	static int[][] map;
	static boolean[] visited;
	
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i=0;i<M;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			map[A][B] = map[B][A] =1;
		}
		
		/*
		for(int i=0; i<N+1;i++) {
			for(int j=0; j<N+1; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		
		DFS(1);
		System.out.println(sum);
	}
	public static void DFS(int a) {
		visited[a] = true;
		
		for(int i=1; i<N+1;i++) {
			if(visited[i]==false && map[a][i] ==1) {
				sum++;
				visited[i]=true;
				DFS(i);
			}
		}
	}
}