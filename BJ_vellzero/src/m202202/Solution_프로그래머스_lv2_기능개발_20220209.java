package m202202;
import java.util.Arrays;

class Solution_프로그래머스_lv2_기능개발_20220209 {
	
public static void main(String[] args) {
		
		int [] progresses = {93,30,55};
		int [] speeds = {1,30,5};
		
		int [] test = solution(progresses, speeds);
		System.out.println(Arrays.toString(test));
		
	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
    	
    	int[] temp = new int[100];
    	int day = 0;
    	
    	for(int i=0; i<progresses.length;i++) {
    		while(progresses[i] + (speeds[i] * day)<100) {
    			day++;
    		}
    		temp[day]++;
    	}
    	
    	int cnt=0;
    	
    	/*
    	for(int n : temp) {
    		if(n!= 0) {
    			cnt++;
    		}
    	}
    	*/
    	
    	for (int i=0; i<temp.length;i++) {
    		if(temp[i] !=0) {
    			cnt ++;
    		}
    	}
    	
    	
        int[] answer = new int[cnt];
        
        cnt =0;
        
        /*
        for(int n: temp) {
        	if(n !=0) {
        		answer[cnt++] = n;
        	}
        }
        */
        for(int i=0; i<temp.length;i++) {
        	if(temp[i] != 0) {
        		answer[cnt++] = temp[i];
        	}
        }
        
        return answer;
    }
}