class Solution {
	
	public static void main(String[] args) {
	
		int [] ans = {5,5} ;
		System.out.print(solution(ans));
		
	}
	public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        answer = sum / arr.length;
        return answer;
    }
}