package m202202.d11;
import java.util.Scanner;

public class Main_백준_삼성A형_17136_골드2_색종이붙이기_20220211{
	
	static int [][] map;
	static int result = Integer.MAX_VALUE;
	static int [] map_number = {5,5,5,5,5};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		map = new int[10][10];
		
		for(int i=0; i<10;i++) {
			for(int j=0; j<10; j++) {
				map[i][j] =sc.nextInt();
			}
		}
		
		DFS(0,0,0);
		
		System.out.println(result);
		
	}
	
	public static void DFS(int r, int c, int count) {
		if(r>=9 && c>9) {
			result = Math.min(result, count);
			return;
		}
		
		if(count>=result) {
			return;
		}
		
		if(c>9) {
			DFS(r+1, 0, count);
			return;
		}
		
		if(map[r][c] ==1) {
			for(int i=4; i>=0; i--) {
				if(map_number[i]>0 && possible(r,c,i+1)) {
					attach(r,c, i+1);
					
					map_number[i]--;
					
					DFS(r, c+1, count+1);
					
					detach(r,c,i+1);
					
					map_number[i]++;
				}
			}
		}
		else {
			DFS(r,c+1,count);
		}
	}
	
	public static void attach(int r, int c, int size) {
		for(int i=r; i<r+size; i++) {
			for(int j=c;j<c+size;j++) {
				map[i][j]=0;
			}
		}
	}
	public static void detach(int r, int c, int size) {
		for(int i=r; i<r+size; i++) {
			for(int j=c;j<c+size;j++) {
				map[i][j]=1;
			}
		}
	}
	public static boolean possible(int r ,int c, int size) {
		for(int i=r; i<r+size; i++) {
			for(int j=c; j<c+size; j++) {
				if(!isln(i,j) || map[i][j]!=1) return false;
			}
		}
		return true;
	}
	
	public static boolean isln(int r, int c) {
		return r>=0 && c>= 0 && r<10 && c<10;
	}
}




