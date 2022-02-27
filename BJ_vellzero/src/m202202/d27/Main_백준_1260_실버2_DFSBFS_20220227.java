package m202202.d27;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1260_실버2_DFSBFS_20220227{
	
	static int N;
	static int M;
	static int V;
	
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<M;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			map[A][B] = map[B][A] =1;
		}
		
		/*  // 그래프배열 잘들어갔는지 배열 확인해보는용도//
		for(int i=0; i<N+1;i++) {
			for(int j=0; j<N+1;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		*/
		
		/*  //방문배열 잘들어갔는지 배열 확인해보는용도//
		for(int i=0; i<N+1;i++) {
			System.out.print(visited[i]+ " ");
		}
		*/
		
		DFS(V);
		System.out.println();
		visited = new boolean[N+1];
		
		BFS(V);
		
	}
	public static void DFS(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i=0;i<N+1;i++) {
			if(visited[i] == false && map[v][i] ==1) {
				DFS(i);
			}
		}
	}
	
	
	public static void BFS(int v) {
		Queue<Integer> queue= new LinkedList<>();
		queue.offer(v);
		visited[v] = true;
		System.out.print(v + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i=0;i<N+1;i++) {
				if(visited[i] == false && map[temp][i] ==1) {
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}