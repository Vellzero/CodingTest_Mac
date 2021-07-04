package no2_Prog_lv2_202107;

import java.util.Stack;

class Solution_짝지어제거하기lv2_20210704 {
	public static void main (String[] args) {
	
		String s = "baabaa";
		int ans = solution(s);
	    //System.out.println(ans);
	}
    public static int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> arr = new Stack<Character>();
        
        
        char [] c = s.toCharArray();

        for(int i=0; i<c.length;i++) {
        	if(!arr.isEmpty()&& arr.peek() == c[i]) {
        		arr.pop();
        	} else {
        		arr.push(c[i]);
        	}
        	
        }
        
        if(arr.isEmpty()) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        
        return answer;
    }
}