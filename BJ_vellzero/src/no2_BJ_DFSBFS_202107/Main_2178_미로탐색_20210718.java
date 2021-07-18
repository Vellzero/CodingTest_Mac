package no2_BJ_DFSBFS_202107;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2178_미로탐색_20210718 {
	static int N; //세로.
	static int M; //가로.
	
	
	static int [][] map ;
	static boolean [][] check ;
	
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	N = sc.nextInt();
    	M = sc.nextInt();
    	
    	map = new int [N+2][M+2];
    	check = new boolean [N+2][M+2];
    	
    	for(int i=0; i<N; i++) {
    		String line = sc.next();
    		for(int j=0; j<line.length(); j++) {
    			int num = line.charAt(j) -'0';
    			map[i+1][j+1] = num;
    		}
    	}
    	bfs(1,1);
    	System.out.println(map[N][M]);

    }
    public static void bfs(int x, int y) {
    	Queue<Point> queue =new LinkedList<>();
    	queue.offer(new Point(x,y));
    	check[x][y] = true;
    	while(!queue.isEmpty()) {
    		Point point = queue.poll();
    		for (int i=0; i<4; i++) {
    			int x2 = point.x + dx[i];
    			int y2 = point.y + dy[i];
    			
    			if(map[x2][y2] ==1 && !check[x2][y2]) {
    				check[x2][y2] = true;
    				queue.offer(new Point(x2,y2));
    				map[x2][y2] = map[point.x][point.y]+ 1;
    			}
    		}
    	}
    	
    }
    
    public static class Point{
    	int x;
    	int y;
    	
    	public Point(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
}
