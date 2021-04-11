package MINCODING_PROtest;

import java.util.Scanner;

public class Main_프로사전테스트_걸어서맛집까지_20210411일 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [][] map = new int[N][M];
		int [][] Index = new int[N][M];
		
		int cnt =0;
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j]= sc.nextInt();
			}
		}
		
		int Jumpo1 =-1;
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				
				if(Index[i][j]!=0) {
					Jumpo1 = Index[i][j];
				}
				
				if(Index[i][j]==0) {
					if(Index[i+1][j] != Jumpo1) Index[i+1][j]++;
					if(Index[i-1][j] != Jumpo1) Index[i-1][j]++;
					if(Index[i][j+1] != Jumpo1) Index[i][j+1]++;
					if(Index[i][j-1] != Jumpo1) Index[i][j-1]++;
				}
				
			}
		}
		
		System.out.println(cnt);
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
	}
 
}