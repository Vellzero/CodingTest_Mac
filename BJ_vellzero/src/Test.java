

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Test {
	
	public static void main(String[] args) {
		
		int [] progresses = {93,30,55};
		int [] speeds = {1,30,5};
		
		int [] test = solution(progresses, speeds);
		System.out.println(Arrays.toString(test));
		
	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> q = new LinkedList<Integer>(); //progresses 큐에 옮겨담기
        Queue<Integer> sp = new LinkedList<Integer>(); //speed 큐에 옮겨담기
        Queue<Integer> a = new LinkedList<Integer>();//answer 큐에 넣을거
        for(int i : progresses) {
        	q.add(i);
        }
        for(int i : speeds) {
        	sp.add(i);
        }
        
        while(!q.isEmpty()) { 			//progresses 큐에 없는 동안 while 문 돌리기
        	if(q.peek() <100) {			//progresses 100 이하일때는 계속 돌리기
        		int temp1 =0;
        		int temp2 =0;
        		for(int i =0; i<q.size();i++) {
        			temp1 = q.poll();
        			temp2 = sp.poll();
        			q.add(temp1 + temp2);	//progresses 숫자 계속 올려주기 100 넘을때까지
        			sp.add(temp2);			//sp는 같은 숫자로 큐 배열 같이 돌려주기
        		}
        	} else {
        		int deploy =0;				//배포할 개수 세기
        		while( q.peek() >= 100) {
        			q.remove();				//배포되면 progresses 큐에서 빼기
            		sp.remove();			//배포되면 sp 큐에서 빼기
            		deploy++;		
            		if(q.isEmpty()) {		//progresses 큐가 비면 while문 탈출
            			break;
            		}
        		}
        		a.add(deploy);				//answer 큐에 deploy 갯수 넣기
        	}
        }
        
        int[] answer = new int[a.size()];	//answer 큐에서 answer로 옮겨닮기
        for(int i =0; i<answer.length;i++) {
        	answer[i] = a.poll();
        }	 
        return answer;
    }
}


