class Solution {
	
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