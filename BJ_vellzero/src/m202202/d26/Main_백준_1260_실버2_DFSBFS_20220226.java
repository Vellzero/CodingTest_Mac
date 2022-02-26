package m202202.d26;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1260_실버2_DFSBFS_20220226{
	
	static int N;
	static int M;
	static int V;
	
	static int[][] map ;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		map = new int[1001][1001];
		visited = new boolean[1001];
		
		for(int i=0;i<M;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			map[A][B] =1;
			map[B][A] =1;
		}
		
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
		dfs(V);
		
		visited = new boolean[1001];
		System.out.println();
		bfs();
	}
	public static void dfs(int i) {
	    visited[i] = true;
	    System.out.print(i + " ");
	    
	    for(int j = 1; j <= N; j++) {
	      if(map[i][j] == 1 && visited[j] == false) {
	        dfs(j);
	      }
	    }
	  }

	 public static void bfs() {
		    Queue<Integer> queue = new LinkedList<Integer>();
		    queue.offer(V); //시작점도 Queue에 넣어야 함
		    visited[V] = true; 
		    System.out.print(V + " ");
		    
		    //Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
		    while(!queue.isEmpty()) {
		      int temp = queue.poll();
		      
		      for(int j = 1; j <= N; j++) {
		        if(map[temp][j] == 1 && visited[j] == false) {
		          queue.offer(j);
		          visited[j] = true;
		          System.out.print(j + " ");
		        }
		      }
		    }
		  }
}