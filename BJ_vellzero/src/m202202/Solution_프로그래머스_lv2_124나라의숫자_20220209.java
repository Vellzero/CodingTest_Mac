package m202202;
class Solution_프로그래머스_lv2_124나라의숫자_20220209 {
	
	public static void main(String[] args) {
	
		int n = 11;
		String ans = solution(n);
	    System.out.println(ans);
		
	}
	 public static String solution(int n) {
		 String[] num = {"4","1","2"};
		 String answer = "";
		 
		 while(n>0) {
			 answer = num[n%3] + answer;
			 n = (n-1) /3;
		 }
		 
		 return answer;
	 }
	 
}