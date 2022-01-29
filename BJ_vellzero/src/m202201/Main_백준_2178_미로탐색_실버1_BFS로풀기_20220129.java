package m202201;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2178_미로탐색_실버1_BFS로풀기_20220129{
	
	static int N;
	static int M;
	
	static int [][] map;
	static boolean [][] visited;
	
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N;i++) {
			String input = sc.next();
			for(int j=0; j<M;j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		
		System.out.println(map[N-1][M-1]);
		
		
		/*
		for(int i=0; i<N;i++) {
			System.out.println();
			for(int j=0; j<M;j++) {
				System.out.print(map[i][j]);
			}
		}
		*/
		
		//System.out.println(N);
		//System.out.println(M);
		
		sc.close();
		
		
	}
	
	public static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {i,j});
		
		while(!q.isEmpty()) {
			int location[] = q.poll();
			visited[i][j] = true;
			
			for( int dir = 0; dir<4; dir++) {
				int r = location[0] + dr[dir];
				int c = location[1] + dc[dir];
				
				if(r >= 0 && c >= 0 && r < N && c< M) {
					if(map[r][c]!= 0 && !visited[r][c]) {
						q.offer(new int[] {r,c});
						visited[r][c] =true;
						map[r][c] = map[location[0]][location[1]] +1;
						
					}
					
				}
			}
		}
		
		
		
	
		
		
		
	}
	
	
}









