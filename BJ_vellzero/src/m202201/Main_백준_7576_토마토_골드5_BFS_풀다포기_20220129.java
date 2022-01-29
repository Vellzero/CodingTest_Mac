package m202201;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import m202107.Main_백준_2178_미로탐색_dfsbfs_20210726.Dot;

public class Main_백준_7576_토마토_골드5_BFS_풀다포기_20220129{
	
	static int M; //가로 
	static int N; //세로 
	
	static int[][] map;
	static boolean [][] visited;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N;i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		bfs();
		
		sc.close();
		
	}
	
	public static void bfs() {
		Queue<Dot> q = new LinkedList<Dot>();
		
	}
	
}