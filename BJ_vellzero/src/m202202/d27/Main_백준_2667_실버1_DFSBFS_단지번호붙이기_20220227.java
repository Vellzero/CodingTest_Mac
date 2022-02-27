package m202202.d27;
import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_2667_실버1_DFSBFS_단지번호붙이기_20220227{
	
	static int N;
	
	static int[][] map;
	static boolean[][] visited;
	
	static int apartNum=0;
	private static int[] aparts = new int[25*25];
	
	
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1][N+1];
		
		for(int i=0;i<N;i++) {
			String sb = sc.next();
			
			for(int j=0; j<N;j++) {
				map[i][j] = sb.charAt(j) -'0';
			}
			
		}
		/*
		for(int i=0;i<N;i++) {
			for(int j=0; j<N;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		*/
		 for(int i=0; i<N; i++){
	            for(int j=0; j<N; j++){
	                if(map[i][j] == 1 && !visited[i][j]){
	                    apartNum++;
	                    dfs(i,j);
	                }
	            }
	        }
		 
		 
		 Arrays.sort(aparts);
	        System.out.println(apartNum);

	        for(int i=0; i<aparts.length; i++){
	            if(aparts[i] == 0){
	            }else{               
	                System.out.println(aparts[i]);
	            }
	        }
		
	}
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		aparts[apartNum]++;
		
		for(int i=0;i<4;i++) {
			int nx= x+ dx[i];
			int ny= y+ dy[i];
			
			if(nx>=0 && ny>=0 && nx<N &&ny<N) {
				if(map[nx][ny] ==1 && visited[nx][ny]== false) {
					dfs(nx,ny);
				}
			}
		}
		
	}
}