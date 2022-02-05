package m202202;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tomato2{
	int x;
	int y;
	int z;
	
	tomato2(int z, int y, int x){
		this.z= z;
		this.y= y;
		this.x= x;
	}
	
}

public class Main_백준_7569_토마토3차원_골드5_BFS_20220205{
	
	static int M; //가로 
	static int N; //세로 
	static int H; //높이 
	
	static int[][][] board;
	
	static Queue<tomato2> que;
	
	static int[] dx = {-1,0,1,0,0,0};
	static int[] dy = {0,1,0,-1,0,0};
	static int[] dz = {0,0,0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
	
		board = new int[H][N][M];
		
		que = new LinkedList<tomato2>();
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N;j++) {
				for (int k=0; k<M;k++) {
					board[i][j][k] = sc.nextInt();
					
					if(board[i][j][k]==1) {
						que.add(new tomato2(i,j,k));
					}
				}
			}
		}
		System.out.println(BFS());
		
	}
	
	public static int BFS() {
		while(!que.isEmpty()) {
			tomato2 t = que.remove();
			
			for(int i=0;i<6;i++) {
				int nx = t.x + dx[i];
				int ny = t.y + dy[i];
				int nz = t.z + dz[i];
				
				if(nx>=0 && ny>=0 && nz>=0 && ny<N && nx<M && nz<H) {
					if(board[nz][ny][nx] ==0) {
						que.add(new tomato2(nz,ny,nx));
						
						board[nz][ny][nx] =board[t.z][t.y][t.x] +1;
					}
				}
			}
		}
		
		int result = Integer.MIN_VALUE;
		
		for(int i=0;i<H;i++) {
			for(int j=0; j<N;j++) {
				for(int k=0; k<M;k++) {
					if(board[i][j][k]==0) return -1;
					result = Math.max(result , board[i][j][k]);
				}
			}
		}
		
		if(result ==1) return 0;
		else return result-1;
	}
}








