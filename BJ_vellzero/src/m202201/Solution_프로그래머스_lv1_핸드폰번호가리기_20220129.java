package m202201;
class Solution_프로그래머스_lv1_핸드폰번호가리기_20220129 {
	
	public static void main(String[] args) {
		
		
		String ans = "027778888" ;
		System.out.print(solution(ans));
		
	}
    public static String solution(String phone_number) {
    	String answer = "";
    	
    	for(int i=0; i< phone_number.length(); i++) {
    		if(i<phone_number.length()-4) {
    			answer +="*";
    		}
    		else {
    			answer += phone_number.charAt(i);
    		}
    	}
    	
        return answer;
    }
}