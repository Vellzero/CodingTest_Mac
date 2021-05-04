package Programmers_level1;
import java.util.ArrayList;
import java.util.Collections;

class K번째수 {
	
	public static void main(String[] args) {
		
	    
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] ans = solution(array,commands);
	    System.out.println(ans);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		
		ArrayList <Integer> temp = new ArrayList<>();
		
		for(int i=0;i<commands.length;i++) {
			int a =commands[i][0];
			int b =commands[i][1];
			int c =commands[i][2];
			
			ArrayList <Integer> list = new ArrayList<>();
			
			for(int j=a-1;j<b;j++) {
				list.add(array[j]);
			}
			Collections.sort(list);
			
			temp.add(list.get(c-1));
		}
       
		int[] answer = new int[temp.size()];
        
        for(int i=0; i<temp.size();i++) { 
        	answer[i] = temp.get(i);
        }
		
        return answer;
    }
}