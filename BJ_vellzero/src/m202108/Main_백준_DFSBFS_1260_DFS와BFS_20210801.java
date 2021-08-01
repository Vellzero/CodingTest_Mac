package m202108;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_DFSBFS_1260_DFS와BFS_20210801 {
	//함수에서 사용할 변수들
	  public static int[][] check; //간선 연결상태
	  public static boolean[] checked; //확인 여부
	  public static int n; //정점개수
	  public static int m; //간선개수
	  public static int start; //시작정점
	  
	  
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  m = sc.nextInt();
	  start = sc.nextInt();
	  
	  check = new int[1001][1001]; //좌표를 그대로 받아들이기 위해 +1해서 선언
	  checked = new boolean[1001]; //초기값 False
	  
	  //간선 연결 상태 저
	  for(int i =0; i<m; i++) {
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  
		  check[x][y] = check[y][x] =1;
	  }
	  
	  dfs(start);
	  
	  checked = new boolean[1001];
	  System.out.println();
	  
	  bfs();
  
  }
  //시작점을 변수로 받아 확인,출력 후 다음 연결점을 찾아 시작점을 변경하여 재호
  public static void dfs(int i) {
	  checked[i] = true;
	  System.out.print(i + " ");
	  
	  for(int j=1; j<=n; j++) {
		  if(check[i][j] == 1 && checked[j] ==false) {
			  dfs(j);
		  }
	  }
	  
  }
  public static void bfs() {
	  Queue<Integer> queue = new LinkedList<Integer>();
	  queue.offer(start); //시작점도 Queue에 넣어야
	  checked[start] = true;
	  System.out.print(start + " ");
	  
	  // queue가 빌 때까지 반복, 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확
	  while(!queue.isEmpty()) {
		  int temp = queue.poll();
		  
		  for(int j=1; j<=n; j++) {
			  if(check[temp][j] ==1 && checked[j] == false) {
				  queue.offer(j);
				  checked[j] = true;
				  System.out.print(j+" ");
			  }
		  }
	  }
  }
  
}