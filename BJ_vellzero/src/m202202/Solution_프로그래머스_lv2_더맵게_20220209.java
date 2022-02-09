package m202202;
import java.util.PriorityQueue;

public class Solution_프로그래머스_lv2_더맵게_20220209{
	
	public static int solution(int[] scoville, int K) {
		int answer =0;
		
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		
		for(int i=0; i<scoville.length;i++) {
			PQ.offer(scoville[i]);
		}
		
		while(PQ.peek() <= K) {
			if(PQ.size() == 1){
				return -1;
			}
			
			int a= PQ.poll();
			int b= PQ.poll();
			
			int result = a+ (b *2);
			
			PQ.offer(result);
			answer ++;
			
			
		}
		
		
		return answer;
		
	}
}