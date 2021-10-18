package m202110;
import java.util.Scanner;

public class Main_백준_1012_유기농배추_DFSBFS_실버2_20211018{
	
	static int N; //추밭의 가로 길이 
	static int M; //배추밭의 세로 길이 
	static int K; //배추가 심어져 있는 위치의 개수 
	
	static int[] dx = {-1,1,0,0}; //상하 
	static int[] dy = {0,0,-1,1}; //좌우 
	
	static int [][] map;    //배추밭 
	static boolean [][] visit; //방문체크
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T =  sc.nextInt(); //테스트케이스 개수, 
		
		for(int tc=1; tc<=T;tc++) {
			M = sc.nextInt();		// 가로 
			N = sc.nextInt();  		// 세로 
			K = sc.nextInt();		// 배추 위치 개수 
			
			map = new int[M][N]; //배추밭 
			visit = new boolean[M][N];  //방문체크  
			
			//배추에 심어져있는 곳 입력  
			for(int i=0; i<K; i++) {
				map[sc.nextInt()][sc.nextInt()] =1;
			}
			
			int count =0; //구역수  
			
			//배추가 있으면 dfs 탐색 시작하고 , 구역 수 증가
			
			for(int i=0; i<M; i++) {
				for(int j=0;j<N;j++) {
					//배추가 있으면서  방문하지 않았으면 dfs탐색하고 구역수 1증가 
					if(map[i][j] ==1 && !visit[i][j]) {
						dfs(i,j);
						count++;
					}
				}
			}
			System.out.println(count);	
			
		}
		
		sc.close();
	}
	public static void dfs(int x, int y) {
		//방문체크하고
		visit[x][y] = true;
		
		//4방면 탐색
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<M && ny<N) {
				if(map[nx][ny]==1 && !visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}


/*
2
10 8 17
0 0
1 0
1 1
4 2
4 3
4 5
2 4
3 4
7 4
8 4
9 4
7 5
8 5
9 5
7 6
8 6
9 6
10 10 1
5 5
*/