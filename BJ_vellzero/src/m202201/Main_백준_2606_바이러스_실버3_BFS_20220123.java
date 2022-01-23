package m202201;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2606_바이러스_실버3_BFS_20220123{
	
	static int[][] check ;
	static boolean[] checked;
	static int N;
	static int M;
	static int count =0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		check = new int[101][101];
		checked = new boolean[101]; 
		
		for(int i=0; i<M; i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			
			check[x][y] = check[y][x] =1;
		}
		
		
		System.out.println(bfs(1));
		
		sc.close();
	}
	
	
	
	public static int bfs(int i) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(i);
		checked[i] =true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for (int j=1; j<=N; j++) {
				if(check[temp][j] ==1 && checked[j] ==false) {
					queue.offer(j);
					checked[j] = true;
					count ++;
				}
			}
		}
		return count;
	}
}




