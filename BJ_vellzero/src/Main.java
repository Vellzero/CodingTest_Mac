import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	//잔디  //
	static int N; //지도의 크기 
	static int count; //단지집의 숫자 
	static int map[][];
	static boolean visit[][];
	
	static ArrayList<Integer> result; //각 단지의 집갯수 
	
	static int[] dr = {-1,1,0,0}; //상하좌우  
	static int[] dc = {0,0,-1,1}; //상하좌우 
	//////
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 지도의 크기  ////
		//////////////////////
		//2차원 배열 지도 //////////////////////	////
		map = new int[N][N];//
		//방문 체크 
		visit = new boolean[N][N];
		
		// 지도 배열 값 입력  
		for(int i=0;i<N;i++) {
			String input =sc.next();
			for(int j=0;j<N;j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		//단지 집의 숫자 
		count =0;
		
		//단지 집의수 결과 저장
		result = new ArrayList<>();
		
		
		//지도 전체 탐
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				//현재 위치의 값이 1이고 true라면 
				if(map[i][j] ==1 && visit[i][j]==false) {
					count =1;
					dfs(i,j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		for ( int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		/*
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}*/
		
		
		
		sc.close();
	}
	public static int dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dr[i];
			int ny = y + dc[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<N) {
				if(map[nx][ny]==1 && visit[nx][ny]==false) {
					dfs(nx,ny);
					count++;
				}
			}
		}
		
		return count;
	}
}