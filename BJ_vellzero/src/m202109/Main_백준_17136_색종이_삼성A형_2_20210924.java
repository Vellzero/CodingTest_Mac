package m202109;
import java.util.Scanner;

public class Main_백준_17136_색종이_삼성A형_2_20210924{
	
	static int[][] map; // 색종이 맵
	static int[] map_number = { 5,5,5,5,5}; // 색종이 개수 각 5개씩
	static int result = Integer.MAX_VALUE; //색종이 개수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		map = new int [10][10]; //10X10 색종이
		
		//색종이 배열 입력
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				map[i][j] =sc.nextInt();
			}
		}
		
		DFS(0,0,0);
		
		if(result == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
		System.out.println(result);
		}
		sc.close();
	}
	
	//DFS + 백트래킹을 해서 풀기
	public static void DFS(int r, int c, int count) {
		// (0,0) 부터 마지막 (9,9) 까지 갈 경우에 색종이 최소값을 구한다.
		if( r>= 9 && c>9) {
			result = Math.min(result , count);
			return;
		}
		
		// count 가 result보다 크거나 같으면 시간 낭비이기 때문에 종료
		if(count >= result) return;
		
		// 줄마다 마지막 칸을 넘을 경우 다음 줄로 가기
		if(c>9) {
			DFS(r+1, 0 , count);
			return;
		}
		
		//색종이 제일 큰 것부터 붙여보자
		// 배열 값에 1이 있으면
		if(map[r][c] ==1 ) {
			//색종이 큰 것부터 준비
			for(int i=4; i>=0; i--) {
				//근데, 색종이가 있을 경우에 붙인다.
				//색종이가 있으면 색종이의 크기만큼 붙일 수 있으면
				if(map_number[i]>0 && possible(r,c, i+1)) {
					// 색종이를 붙인다 , i에 1을 더한 이유는 0~4까지 1,2,3,4,5
					attach(r,c, i+1);
					
					// 색종이 갯수 줄이기
					map_number[i]--;
					
					//계속 붙이기
					DFS(r, c+1, count+1);
					
					//색종이 떼기
					detach(r,c,i+1);
					
					//색종이 떼고 갯수 늘리기
					map_number[i]++;
					
					
				}
			}
		}
		// 배열 값에 1이 없으면
		
		else DFS(r,c+1,count);
		
	}
	//색종이 붙이기
	public static void attach(int r, int c, int size) {
		for(int i=r; i<r+size; i++) {
			for(int j=c; j<c+size;j++) {
				map[i][j] =0;
			}
		}
	}
	// 색종이 떼기
	public static void detach(int r, int c, int size) {
		for (int i=r; i<r+size ; i++) {
			for(int j=c; j<c+size; j++) {
				map[i][j] =1;
			}
		}
	}
	
	// 색종이 범위 내에 있는지 확인
	public static boolean isln(int r, int c) {
		return r>= 0 && c>= 0 && r<10 && c<10;
	}
	
	// 색종이의 크기만큼 붙일 수 있는지 확인
	public static boolean possible(int r, int c, int size) {
		//색종이의 size만큼 확인
		for(int i=r; i<r+size;i++) {
			for(int j=c; j<c+size;j++) {
				//범위를 벗어나거나 그 위치가 1이 아니라면 false 리턴
				if(!isln(i,j) || map[i][j]!=1) return false;
			}
		}
		return true;
	}
}

















