// 2개 통과 못함 + 왜 시간초과 나지??

class Solution {
	
	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean ans = solution(phone_book);
				
		//System.out.println(ans);
		
	}
	
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i =0; i<phone_book.length;i++) {
        	for (int j =0; j<phone_book.length;j++) {
        		if(i!=j) {
        			if(phone_book[i].indexOf(phone_book[j])==0) {
        				return false;
        			}
        		}else {
        			continue;
        		}
        	}
        }
        return answer;
    }
}