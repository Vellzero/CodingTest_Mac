package m202201;
import java.util.Scanner;

public class Main_백준_1012_유기농배추_실버2_DFS_20220128{
	
	static int M;
	static int N;
	static int K;
	
	static int[][] map;
	static boolean[][] visited;
	
	static int[] dr = {-1,1,0,0}; //상하좌우  
	static int[] dc = {0,0,-1,1}; //상하좌
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			map = new int [M][N];
			visited = new boolean[M][N];
			
			for(int j=0; j<K; j++) {
				map[sc.nextInt()][sc.nextInt()] =1;
			}
			
			int count =0;
			
			for(int j=0; j<M; j++) {
				for (int k=0; k<N; k++) {
					if(map[j][k] ==1 && !visited[j][k]) {
						dfs(j,k);
						count++;
					}
				}
			}
			
			System.out.println(count);
			
		}
		
		
		sc.close();
		
		
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] =true;
		
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr>=0 && nc >= 0 && nr <M && nc <N) {
				if(map[nr][nc] ==1 && !visited[nr][nc]) {
					dfs(nr,nc);
				}
			}
			
			
		}
		
		
	}
	
}