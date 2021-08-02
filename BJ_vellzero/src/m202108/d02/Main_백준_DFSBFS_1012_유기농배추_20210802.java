package m202108.d02;
import java.util.*;

public class Main_백준_DFSBFS_1012_유기농배추_20210802 {
	static int M; //배추밭의 가로 길이.
	static int N; //배추밭의 세로 길이.
	static int K; //배추가 심어져 있는 위치의 갯수.
	
	static int[] dr = {-1,1,0,0};   //상하좌우. 
	static int[] dc = {0,0,-1,1};   //상하좌우.
	
	static int [][] map; //배추밭.
	static boolean[][] visit; //방문 체크.
	
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt(); //테스트케이스 갯수.
    	
    	
    	for(int tc=1; tc<=T;tc++) {
    		M = sc.nextInt();
    		N = sc.nextInt();
    		K = sc.nextInt();
    		
    		map = new int[M][N];
    		visit = new boolean[M][N];
    		
    		//배추밭에 배추가 심어져 있는곳 입
    		for(int i=0;i<K;i++) {
    			map[sc.nextInt()][sc.nextInt()] = 1; 
    		}
    		
    		int count=0; //구역 수
    		
    		//배추가 있으면 dfs 탐색 시작하고, 구역 수 증가
    		for(int i=0;i<M;i++) {
    			for(int j=0;j<N;j++) {
    				//배추가 있으면서 방문하지 않았으면 dfs 탐색하고 구역 수 1증가
    				if(map[i][j]==1 && !visit[i][j]) {
    					dfs(i,j);
    					count ++;
    				}
    			}
    		}
    		System.out.println(count);
    	}
    	
    }
    public static void dfs(int r,int c) {
    	visit [r][c] =true;
    	
    	//4방면 탐색.
    	for(int i=0; i<4; i++) {
    		int nr = r + dr[i];
    		int nc = c + dc[i];
    		
    		if(nr>=0 && nc>=0 && nr<M && nc<N) {
    			//배추가 있고 방문하지 않았으면 dfs 탐색
    			if(map[nr][nc] ==1 && !visit[nr][nc]) {
    				dfs(nr,nc);
    			}
    		}
    	}
    }
}
