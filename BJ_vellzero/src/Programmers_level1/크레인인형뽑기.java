package Programmers_level1;
import java.util.Stack;

class Solution {
	public static void main(String args[]) {
		
	int board [][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int move [] = {1,5,3,5,1,2,1,4};
    
    int ans = solution(board,move);
    System.out.println(ans);
	}
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack <Integer> stack = new Stack<>(); 
        
        
        
        for(int i=0; i<moves.length;i++) {
        		int a = moves[i];
        		int b = 0;
        		while(true) {
        			if(b>=board[0].length) {
        				break;
        			}
        			if(board[b][a-1]!=0) {
        				if(stack.size()!=0 && stack.peek()== board[b][a-1]) {
        					stack.pop();
        					answer+= 2;
        				}
        				else {
        					stack.add(board[b][a-1]);
        				}
        				board[b][a-1] =0;
        				break;
        			}
        			b++;
        		}
        				
        }
        
        
        
        
        return answer;
    }
}