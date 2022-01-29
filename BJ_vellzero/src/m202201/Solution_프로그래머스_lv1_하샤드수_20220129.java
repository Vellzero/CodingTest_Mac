package m202201;
class Solution_프로그래머스_lv1_하샤드수_20220129 {
	
	public static void main(String[] args) {
	
		int ans = 10 ;
		System.out.print(solution(ans));
		
	}
	 public static boolean solution(int x) {
	        boolean answer = true;
	        
	        int sum =0;
	        int a= x;
	        
	        while (a>=1) {
	        	sum += a%10;
	        	a /= 10;
	        }
	        
	        if( x % sum ==0) {
	        	return true;
	        } else {
	        	return false;
	        }
	        
	 }
}