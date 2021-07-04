package no2_Prog_lv2_202107;

import java.util.PriorityQueue;

class Solution_더맵게lv2_20210704 {
	public static void main (String[] args) {
		int K = 7;
		
		int [] scoville = {1, 2, 3, 9, 10, 12};
		int ans = solution(scoville,K);
	    System.out.println(ans);
	}
	
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue <Integer> q= new PriorityQueue<>();
        
        for(int i=0; i< scoville.length; i++) {
        	q.add(scoville[i]);
        }
        
        
        //System.out.println(q);
        
        int count = 0;
        while(K > q.peek()) {
        	if(q.size()==1) {
        		count = -1;
                break;
        	}else{
        	int a = q.poll();
        	int b = q.poll();
        	
        	q.offer(a+(b*2));
        	count ++;
            }
        	//System.out.println(q);
        }
        
        answer = count;
        
        return answer;
    }
}