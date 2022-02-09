import java.util.PriorityQueue;
import java.util.Queue;

class Test {
	
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        Queue <Integer> q= new PriorityQueue<>();
        
        for(int i=0; i< scoville.length; i++) {
        	q.add(scoville[i]);
        }
        
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
        }
        
        answer = count;
        
        return answer;
    }
}