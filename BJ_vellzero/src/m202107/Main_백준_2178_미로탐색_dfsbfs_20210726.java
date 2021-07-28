package m202107;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2178_미로탐색_dfsbfs_20210726 {
	public static int A;
	public static int B;
	public static int map [][];
	public static boolean visited[][];
	public static int[] dx = { -1, 0, 1, 0};
	public static int[] dy = { 0, -1, 0, 1};
 
    public static void main(String args[]) throws Exception {
         Scanner sc = new Scanner(System.in);
         
         A = sc.nextInt();
         B = sc.nextInt();
         
         sc. nextLine();
         map = new int[A][B];
         visited = new boolean [A][B];
         
         for(int i=0;i<A;i++) {
        	 String str = sc.nextLine();
        	 for(int j=0;j<B;j++) {
        		 map[i][j] = str.charAt(j) - '0';
        		 visited[i][j] = false;
        	 }
         }
         
         visited[0][0] = true;
         BFS(0,0);
         sc.close();
         System.out.println(map[A-1][B-1]);
    }
    public static void  BFS(int x,int y) {
    	
    	Queue<Dot> q = new LinkedList<Dot>();
    	q.add(new Dot(x,y));
    	
    	while(!q.isEmpty()) {
    		Dot d = q.poll();
    		for(int i=0; i<4; i++) {
    			int nextX = d.x + dx[i];
    			int nextY = d.y + dy[i];
    			
    			if(nextX<0 || nextY<0 || nextX >= A || nextY>=B) {
    				continue;
    			}
    			if (visited[nextX][nextY] || map[nextX][nextY]==0) {
    				continue;
    			}
    			
    			q.add(new Dot(nextX,nextY));
    			map[nextX][nextY] = map[d.x][d.y]+1;
    			visited[nextX][nextY] =true;
    		}
    	}
    	
    }
    
    public static class Dot{
    	int x;
    	int y;
    	
    	Dot(int x, int y){
    		this.x = x;
    		this.y = y;
    	}
    }
}