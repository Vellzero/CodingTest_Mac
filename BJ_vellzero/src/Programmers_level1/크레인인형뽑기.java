package Programmers_level1;
class 크레인인형뽑기 {
	public static void main(String args[]) {
		
	int board [][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int move [] = {1,5,3,5,1,2,1,4};
    
    int ans = solution(board,move);
    System.out.println(ans);
	}
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        return answer;
    }
}