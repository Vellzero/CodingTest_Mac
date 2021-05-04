package Programmers_level1;
class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] A = new int[n];
      
        
    	for (int i : reserve) {
    		A[i - 1]++;
    	}
    	for (int i : lost) {
    		A[i - 1]--;
    	}
    	
        for(int i=0; i<A.length; i++) {
        	if(A[i]<0) {
    			if (i != A.length - 1 && A[i + 1] > 0) {
    				A[i]++;
    				A[i + 1]--;
    			} else if (i != 0 && A[i - 1] > 0) {
    				A[i]++;
    				A[i - 1]--;
    			}

        		
        	}
        }
        
    	for (int i = 0; i < A.length; i++) {
    		if ((A[i] >= 0))
    			answer++;

    	}
        return answer;
    }
}