package m202202.d10;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution_프로그래머스_lv2_스택큐_프린터_20220210 {
	
	public static void main(String[] args) {
		int [] priorities = {2,1,3,2};
		int location =2;
		//int [] priorities2 = {1,1,9,1,1,1};
		//int location2 =0;
		int ans = solution(priorities,location);
		//int ans2 = solution(priorities2,location2);
		System.out.println(ans);
		//System.out.println(ans2);
	}
	
    public static int solution(int[] priorities, int location) {
    	int answer =0;
        Queue <Integer> q = new LinkedList<>();
        Queue <Integer> loca = new LinkedList<>();
        
        
        for(int i : priorities) {
        	q.add(i);
        }
        
        for(int i=0;i<priorities.length;i++) {
        	loca.add(i);
        }
        Arrays.sort(priorities);
        int max = priorities[priorities.length-1];
        
        
        while(q.peek() !=max) {
        	int temp = q.poll();
        	q.add(temp);
        	int temp2 = loca.poll();
        	loca.add(temp2);
        }
        
        int cnt=0;
        
        while(true) {
        	if(loca.peek() == location) {
        		cnt++;
            	break;
        	}else {
            	int temp = q.poll();
            	q.add(temp);
            	int temp2 = loca.poll();
            	loca.add(temp2);
            	cnt++;
        	}
        }
        answer = cnt;
        return answer;
    }
}