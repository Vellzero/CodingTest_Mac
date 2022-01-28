package m202201;
import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_2676_단지번호붙이기_실버1_DFS_20220128{
	
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	static int [][] map ;
	static boolean [][] visited; 
	
	static int apartNum;
	static int[] aparts;
	
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map  = new int[N][N];
		visited = new boolean [N][N];
		aparts = new int [N*N];
		
		//전체 사각형 입력받기  
		for(int i=0; i<N;i++) {
			String input = sc.next();
			for(int j=0; j<N; j++) {
				map [i][j] = input.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map [i][j]== 1 && !visited[i][j]) {
					apartNum++;
					dfs(i,j);
				}
			}
		}
		
		
		Arrays.sort(aparts);
		
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i] ==0){
				
			}else {
				System.out.println(aparts[i]);
			}
			
		}
		
		
		
		/*
		 //출력
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		*/
		
		sc.close();
				
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		aparts[apartNum]++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny >=0 && nx <N && ny < N) {
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
			
		}
		
	}
	
	
}