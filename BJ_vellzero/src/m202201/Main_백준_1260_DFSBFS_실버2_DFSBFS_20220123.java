package m202201;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1260_DFSBFS_실버2_DFSBFS_20220123{
	//함수에 사용할 변수
	static int [][] check; //간선 연결상태 
	static boolean [] checked; //확인 여부 
	static int N;  // 정점의 개수 N
	static int M;  // 간선의 개수 M
	static int V;  // 탐색을 시작할 정점의 번호 V
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); 
		M = sc.nextInt(); 
		V = sc.nextInt(); 
		
		check = new int[1001][1001]; //좌표 그대로 받아들이기 위해 +1로해서 1001로 선언   
		checked = new boolean[1001]; //초기값 false  
		
		//간선 연결상태 저장  
		for(int i=0; i<N;i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			
			check[x][y] = check[y][x] =1;
			
		}
		
		dfs(V);
		
		checked = new boolean[1001]; //DFS 초기화하
		
		System.out.println(); //줄바꿈 
		
		bfs();
		
		sc.close();
	}
	
	//시작점을 변수로 받아 확인, 출력 후  다음 연결점을 찾아  시작점을 변경하여 재호출  
	public static void dfs(int i) {
		checked[i] =true;
		System.out.println(i + " ");
		
		for(int j=0; j<=N; j++) {
			if(check[i][j] ==1 && checked[j] ==false) {
				dfs(j);
			}
		}
		
		
		
	}
	
	public static void bfs(){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V); //시작점도 queue에 넣어야함
		checked[V] = true;
		System.out.println(V +	" ");
		
		//Queue가 빌 때까지 반복 , 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int j=1; j<=N; j++ ) {
				if(check[temp][j] == 1 && checked[j]==false) {
					queue.offer(j);
					checked[j] =true;
					System.out.println(j + " ");
				}
			}
		}
	}
}







