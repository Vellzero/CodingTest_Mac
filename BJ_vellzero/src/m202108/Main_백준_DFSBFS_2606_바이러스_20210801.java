package m202108;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_DFSBFS_2606_바이러스_20210801 {
	//함수에서 사용할 변수들
	public static int node[][]; // 그래프 배열 
	public static int check[];  // 방문 배열 
	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  
	  node = new int [n+1][n+1];
	  check = new int [n+1];
	  
	  for(int i=0; i<m;i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  
		  node[a][b]=1;
		  node[b][a]=1;
	  }
	  
	  bfs(1);
	  
  }
  public static void bfs(int start) {
	  Queue<Integer> queue = new LinkedList<>();
	  
	  check[start] = 1;
	  queue.offer(start);
	  int cnt =0;
	  while(!queue.isEmpty()) {
		  int x = queue.poll();
		  
		  for(int i=1; i<node.length;i++) {
			  if(node[x][i] ==1 && check[i] != 1) {
				  queue.offer(i);
				  check[i] =1;
				  cnt ++;
			  }
		  }
	  }
	  System.out.println(cnt);
	
  }
  
}