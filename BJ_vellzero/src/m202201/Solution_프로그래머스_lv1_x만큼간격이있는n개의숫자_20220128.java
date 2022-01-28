package m202201;
class Solution_프로그래머스_lv1_x만큼간격이있는n개의숫자_20220128 {
    public long[] solution(int x, int n) {
    	long[] answer = new long [n];
    	long num =x;
    	
    	for(int i=0;i<n;i++) {
    		answer[i] = num;
    	    num += x;
    	}
    	
        return answer;
    }
}