package no2_Prog_lv1_202106;

class Solution_음양더하기 {
	public static void main (String[] args) {
		int [] absolutes = {4,7,12};
		
		boolean [] signs = {true,false,true};
		int ans = solution(absolutes,signs);
	    System.out.println(ans);
	}
	public static int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i=0; i<absolutes.length;i++) {
	        	if(signs[i]==true) {
	        		answer += absolutes[i] ;
	        	}
	        	else{
	        		answer += (absolutes[i] * (-1));
	        	}
	        }
	        
	        
	        return answer;
	}
}
