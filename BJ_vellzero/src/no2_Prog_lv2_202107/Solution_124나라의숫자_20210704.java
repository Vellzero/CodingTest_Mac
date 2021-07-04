package no2_Prog_lv2_202107;


class Solution_124나라의숫자_20210704 {
	public static void main (String[] args) {
	
		int n = 11;
		String ans = solution(n);
	    System.out.println(ans);
	}
    public static String solution(int n) {
    	String[] num = {"4", "1", "2"};
    	String answer = "";

    	while (n > 0) {
    		answer = num[n % 3] + answer;
    		n = (n - 1) / 3;
    	}

    	return answer;
    }
}