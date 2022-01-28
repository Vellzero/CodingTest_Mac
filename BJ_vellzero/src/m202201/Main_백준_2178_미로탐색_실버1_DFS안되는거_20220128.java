package m202201;
import java.util.Scanner;

public class Main_백준_2178_미로탐색_실버1_DFS안되는거_20220128{
	
	static int N;
	static int M;
	
	static int [][] map;
	static boolean [][] visited;
	
	static int [] dr = {-1,1,0,0};
	static int [] dc = {0,0,-1,1};
	
	static int count=1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visited= new boolean [N][M];
		
		for(int i=0;i<N;i++) {
			
			String input = sc.next();
			
			for(int j=0;j<M;j++) {
				
				map[i][j] = input.charAt(j) -'0';
				
			}
		}
		
		dfs(1,1);
		System.out.println(count);
		/*
		for(int i=0;i<N;i++) {
			System.out.println();
			for(int j=0;j<M;j++) {
				System.out.print(map[i][j]);
			}
		}
		*/
		
		sc.close();
		
		
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		count ++;
		
		for(int i=0;i<4;i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr>=0 && nc>0 && nr<N && nc<M) {
				if(map[nr][nc] == 1 && !visited[nr][nc]) {
					dfs(nr,nc);
				}
				
			}
		}
	}
}