package m202202;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_1697_숨바꼭질_실버1_BFS_20220205{
	
	static int N;
	static int K;
	
	static int[] check = new int[10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		if(N==K) {
			System.out.println(0);
		}else {
			BFS(N);
		}
		
	}
	
	public static void BFS(int num) {
		Queue<Integer> q= new LinkedList<>();
		
		q.add(num);
		check[num] = 1;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for(int i=0; i<3; i++) {
				int next;
				
				if(i ==0) {
					next = temp +1;
				}else if(i ==1) {
					next = temp -1;
				}else {
					next = temp * 2;
				}
				if(next ==K) {
					System.out.println(check[temp]);
					return;
				}
				
				if(next>=0 && next< check.length && check[next] ==0) {
					q.add(next);
					check[next] = check[temp] + 1;
				}
			}
			
		}
		
		
	}
}