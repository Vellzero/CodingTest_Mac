package MINCODING_PROtest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_프로사전테스트_패키지관리시스템_20210410토 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		ArrayList<Integer> [] parent = new ArrayList[N+1];
		
		ArrayList<Integer> [] JS = new ArrayList[N+1];
		
		
		for(int i=1;i<=N;i++)
		{
			parent[i] = new ArrayList<>();
			JS[i] = new ArrayList<>();
		}
		
		for(int i=0; i<Q;i++) {
			
			String A = sc.next();
			if(A.equals("depend")) {
				int B = sc.nextInt();
				int C = sc.nextInt();
				
				if(!JS[B].contains(C)) {
					JS[B].add(C);
				}
				
				if(!parent[B].contains(C)) {
					parent[B].add(C);
				}
				
				for(int j=0;j<parent[C].size();j++) {
					
					if(!parent[B].contains(parent[C].get(j))) {
						
						parent[B].add(parent[C].get(j));
					}
					
				}
				
				while(true) {
					int idx=B;
					for(int j=1;j<=N;j++) {
						if(JS[j].contains(idx)) {
							for(int k=0;k<parent[idx].size();k++) {
								
								if(!parent[j].contains(parent[idx].get(k))) {
									
									parent[j].add(parent[idx].get(k));
									
								}
								
							}
						}
					}
				}
					
			}else if(A.equals("setup")) {
				int B = sc.nextInt();
				
				Collections.sort(parent[B]);
				
				
				for(int j =0;j<parent[B].size();j++) {
					
					System.out.print(parent[B].get(j) + " ");
					}
					System.out.println();
				}
		}
		
		System.out.println("=============");
		
		
		for(int i=1;i<=N;i++) {
			Collections.sort(parent[i]);
			for(int j =0;j<parent[i].size();j++) {
			
			System.out.print(parent[i].get(j));
			}
			System.out.println();
		}
		
		
		System.out.println("=============");
		
		for(int i=1;i<=N;i++) {
			Collections.sort(JS[i]);
			for(int j =0;j<JS[i].size();j++) {
			System.out.print(JS[i].get(j));
			
			}
			System.out.println();
		}
		
		
		sc.close();
	}
 
}