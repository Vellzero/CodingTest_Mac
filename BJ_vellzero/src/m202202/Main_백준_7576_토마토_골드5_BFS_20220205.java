package m202202;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tomato{
	int x; //세로
	int y; //가로
	
	tomato(int x, int y){
		this.x =x;
		this.y =y;
	}
}

public class Main_백준_7576_토마토_골드5_BFS_20220205{
	
	static int M; //가로 
	static int N; //세
	
	static int [][] board;
	
	static Queue<tomato> que;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		board = new int[N][M];
		
		que = new LinkedList<tomato>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				board[i][j] = sc.nextInt();
				
				if(board[i][j] ==1) {
					que.add(new tomato(i,j));
				}
			}
		}
		System.out.println(BFS());
		
	}
	public static int BFS() {
		while(!que.isEmpty()) {
			tomato t= que.remove();
			
			int x= t.x;
			int y= t.y;
			
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<M) {
					if(board[nx][ny] ==0) {
						que.add(new tomato(nx,ny));
						
						board[nx][ny] = board[x][y] +1;
					}
				}
			}
			
		}
		
		
		int result = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(board[i][j] ==0) {
					return -1;
				}
				result = Math.max(result,board[i][j]);
			}
		}
		
		if(result ==1) {
			return 0;
		}else {
			return result-1;
		}
		
		
	}
	
}




