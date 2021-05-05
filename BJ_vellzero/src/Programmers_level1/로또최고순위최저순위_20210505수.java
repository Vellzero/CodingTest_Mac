package Programmers_level1;
import java.util.Arrays;

class 로또최고순위최저순위_20210505수 {
	public static void main (String[] args) {
		int [] lottos = {44, 1, 0, 0, 31, 25};
		
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		int [] ans = solution(lottos,win_nums);
	    System.out.println(Arrays.toString(ans));
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero =0;
        int same =0;
        int rank1 =6;
        int rank2 =6;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i=0;i<lottos.length;i++) {
        	if(lottos[i]==0) {
        		zero++;
        	}
        }
        
        for(int i=0;i<lottos.length;i++) {
        	for(int j=0;j<win_nums.length;j++) {
        		if(lottos[i]==win_nums[j]) {
        			same++;
        		}
        	}
        }
        
        if(same+zero==6) rank1=1; 
        if(same+zero==5) rank1=2; 
        if(same+zero==4) rank1=3; 
        if(same+zero==3) rank1=4; 
        if(same+zero==2) rank1=5; 
        if(same+zero==1) rank1=6; 
        
        if(same==6) rank2=1; 
        if(same==5) rank2=2; 
        if(same==4) rank2=3; 
        if(same==3) rank2=4; 
        if(same==2) rank2=5; 
        if(same==1) rank2=6; 
        
        answer[0] = rank1;
        answer[1] = rank2;
        return answer;
    }
}