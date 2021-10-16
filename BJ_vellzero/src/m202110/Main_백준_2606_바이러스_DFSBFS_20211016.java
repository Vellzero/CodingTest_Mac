package m202110;
import java.util.Scanner;

public class Main_백준_2606_바이러스_DFSBFS_20211016{
	
	static int N; // 컴퓨터의 수  (정점)
	static int M; // 네트워크 상에 직접연결되어있는 컴퓨터 쌍의 수 (간선)
	static int V; // 탐색시작할 정점의 번
	static int[][] map; //각 정점간 탐색 경로를 저장할 배열 
 	static boolean[] checked; //정점의탐색여부 체크 
 	static int count =0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = 1;
		map = new int[N+1][N+1]; //배열은 N+1
		checked = new boolean[N+1]; //정점의 탐색 여부 체크  
		 
		for(int i=0; i<M;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			map[a][b] = map[b][a] =1;
		}
		
		
		System.out.println(dfs(1));
		sc.close();
	}
	public static int dfs(int i) {
		checked[i] = true;
		
		for(int j=1;j<=N;j++) {
			if(map[i][j] ==1 && checked[j] ==false) {
				count ++;
				dfs(j);
			}
		}
		
		
		return count;
	}
}




/*
7
6
1 2
2 3
1 5
5 2
5 6
4 7
*/