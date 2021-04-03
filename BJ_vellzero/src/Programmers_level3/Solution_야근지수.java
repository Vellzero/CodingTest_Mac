package Programmers_level3;

import java.util.Arrays;
import java.util.Collections;

public class Solution_야근지수 {

	public static void main(String[] args) {
		Integer [] a = {5,4,2};
		int n = 8;
		
		long ans = solution(n,a);
		
		System.out.println(ans);
		
	}

	
    public static long solution(int n, Integer[] works) {
        long answer = 0;
        
        Arrays.sort(works,Collections.reverseOrder());
        System.out.println(Arrays.toString(works));
        
        while(n!=0) {
			int max = 0;

			// 현재 배열 중 작업량이 가장 큰 수 찾기
			for(int i=0; i<works.length; i++) 
				if(works[i] > max)	{
					max = works[i];
				}

			// 배열 요소중 max 값과 동일하면 전부 다 감소시키기
			for(int i=0; i<works.length; i++) {
				if(works[i] == max) {
					works[i] --;
					n --;
					// n이 0일시 => 더이상 감소시키지 말고 종료
					if(n == 0)	break;
				}
			}
		}
        
        	
        
        
        for(int i=0; i<works.length;i++) {
        	answer += works[i]*works[i];
        }
        
        return answer;
    }
}
