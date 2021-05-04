package Programmers_level1;
import java.util.HashSet;
import java.util.Set;

class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        
        
        int A = (nums.length)/2;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	set.add(nums[i]);
        }
        
        answer = set.size();
        
        if(answer>A) {
        	answer = A;
        }
        
        return answer;
    }
}