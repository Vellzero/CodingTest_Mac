package m202109;
import java.util.Scanner;

public class Main_17070_파이프옮기기_삼성A형_20210909{
	static int N; //집의 크기 
	static int [][] home; //집 
	static int count; //파이프개수 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //집의 크기
		
		//집배열선언 
		home = new int[N][N];
		
		//home 입력 
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				home[i][j] = sc.nextInt();
			}
		}
		//첫 파이프의 위치에는 home[0][0]=0;home[0][1]=1
		//x,y,dir
		//dir 0 :가로 1:세로 2:대각선 
		move(0,1,0);
		System.out.println(count);
	}
	public static void move(int x , int y , int dir) {
		//N*N에 도착하면서 그 위치가 파이프가 없으면
				if(x==N-1 && y==N-1 && home[x][y]!=1) {
					count++;
					return;
				}
				
				//파이프가 가로일 때
				if(dir==0) {
					//가로로 밀 때
					if(isIn(x,y+1) && home[x][y+1]==0) move(x,y+1,0);
					
					//오른쪽 아래 대각선으로 밀 때
					//현재 위치 오른쪽, 대각선, 아래가 모두 0이면
					if(isIn(x+1,y+1) && home[x][y+1]==0 && home[x+1][y+1]==0 && home[x+1][y]==0) move(x+1,y+1,2);
				}
				
				//파이프가 세로일 때
				else if(dir==1) {
					//세로로 밀 때
					if(isIn(x+1,y) && home[x+1][y]==0) move(x+1,y,1);
					
					//오른쪽 아래 대각선으로 밀 때
					//현재 위치 오른쪽, 대각선, 아래가 모두 0이면
					if(isIn(x+1,y+1) && home[x][y+1]==0 && home[x+1][y+1]==0 && home[x+1][y]==0) move(x+1,y+1,2);
				}
				
				//파이프가 대각선일 때
				else if(dir==2) {
					//가로로 밀 때
					if(isIn(x,y+1) && home[x][y+1]==0) move(x,y+1,0);
					
					//세로로 밀 때
					if(isIn(x+1,y) && home[x+1][y]==0) move(x+1,y,1);
					
					//오른쪽 아래 대각선으로 밀 때
					//현재 위치 오른쪽, 대각선, 아래가 모두 0이면
					if(isIn(x+1,y+1) && home[x][y+1]==0 && home[x+1][y+1]==0 && home[x+1][y]==0) move(x+1,y+1,2);
				}
	}
	//범위 확인
	public static boolean isIn(int x,int y) {
		return x>=0 && y>=0 && x<N && y<N ;
	}
		
		
		
		
	
}