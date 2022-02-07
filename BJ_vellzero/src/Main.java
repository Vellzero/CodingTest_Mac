import java.util.Scanner;

public class Main{
	
	static int N;
	static int[][] map;
	
	static int count;
	////
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N+1][N+1];
		
		for(int i=1; i<=N;i++) {
			for (int j=1; j<=N;j++) {
				map[i][j] =sc.nextInt();
			}
		}
		
		DFS(1,2,0);
		System.out.println(count);
		
	}
	public static void DFS(int x, int y, int dir) {
		if(x==N && y ==N && map[x][y] !=1) {
			count ++;
			return;
		}
		
		 switch (dir) {
	        case 0: // 파이프가 가로 방향일 경우, 갈 수 있는 경우는 동쪽과 대각선임.
	            if (y + 1 <= N && map[x][y + 1] == 0) { // 동쪽
	                DFS(x, y + 1, 0);
	            }
	            break;
	        case 1: // 파이프가 세로 방향일 경우, 갈 수 있는 경우는 남쪽과 대각선임.
	            if (x + 1 <= N && map[x + 1][y] == 0) { // 남쪽
	                DFS(x + 1, y, 1);
	            }
	            break;
	        case 2: // 파이프가 대각선일 경우, 갈 수 있는 경우는 동쪽과 남쪽, 대각선임.
	            if (y + 1 <= N && map[x][y + 1] == 0) { // 동쪽
	                DFS(x, y + 1, 0);
	            }
	 
	            if (x + 1 <= N && map[x + 1][y] == 0) { // 남쪽
	                DFS(x + 1, y, 1);
	            }
	            break;
	        }
	 
	        // 파이프가 어떤 방향이든지, 대각선은 검사해서 가장 아래로 뺐음.
	        if (y + 1 <= N && x + 1 <= N && map[x][y + 1] == 0 && map[x + 1][y] == 0 && map[x + 1][y + 1] == 0) {
	            DFS(x + 1, y + 1, 2);
	        }
		
	}
}











