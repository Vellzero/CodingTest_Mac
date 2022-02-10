package m202202.d10;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_백준_삼성A형_17135_골드4_캐슬디펜스_어려워서못품_20220210{
	
	static int n,m,d;
	
	static int [][] map;
	
	static int ans=0;
	
	static ArrayList<Integer> arrow = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		
		map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		nCr(0,0);
		System.out.println(ans);
		
	}
	
	//궁수를 넣을 수 있는 경우의 수  
	public static void nCr(int cnt, int start) {
		if(cnt ==3 ) {
			attack();
			return;
		}
		
		for(int i=start;i<m;i++) {
			arrow.add(i);
			nCr(cnt+1, i+1);
			arrow.remove(arrow.size()-1);
		}
	}
	
	
	// 궁수의 위치가 정해지면 공격을 한다 
	private static void attack() {
		int temp=0;
		int castle=n; //초기 성의 위치 
		int[][] map2=new int[n][m]; // 방문된 곳은 0으로 표시하기 위해 다른 배열 만듦
		for (int i = 0; i < n; i++) {
			System.arraycopy(map[i], 0, map2[i], 0, m);
		}

		while(castle>0) { // 모든 궁수가 예외가 될 때까지 
			ArrayList<Integer[]> enemy=new ArrayList<>(); //공격할 적이 들어가는 배열 
			for (int k = 0; k < arrow.size(); k++) { //모든 궁수는 가장 가까운 적을 찾는다
				int min=Integer.MAX_VALUE;
				int []pos=new int[2]; // 현재 궁수에서 가장 가까운 적의 위치 담는 배열
				for (int j = 0; j < m; j++) {
					for(int i=castle-1;i>=0;i--) {
						int diff=Math.abs(castle-i)+Math.abs(arrow.get(k)-j);//적과의 거리

						if(map2[i][j]==1 && diff<=d) { //공격할 수 있는 거리에 적이 있다면
							if(diff<min) { //새로운 적이 더 가까이 있다면 거리와 위치 갱신
								min=diff;
								pos[0]=i;
								pos[1]=j;
							}
							break;
						}
					}
				}
				if(min!=Integer.MAX_VALUE) { //만약 공격할 수 있는 적이 있다면 enemy에 추가
					enemy.add(new Integer[]{pos[0],pos[1]});
				}
			}	
			for (int i = 0; i < enemy.size(); i++) { //모든 궁수가 공격할 수 있는 enemy배열
				if(map2[enemy.get(i)[0]][enemy.get(i)[1]]!=0) { //중복되는 적은 0처리해준다.
					temp+=1;
					map2[enemy.get(i)[0]][enemy.get(i)[1]]=0;
				}
			}
			castle-=1; // 성이 위로 올라감. 적이 더 가까이 다가옴

		}

		if(temp>ans)ans=temp; //전체 적의 수 갱신
	}
	
}





