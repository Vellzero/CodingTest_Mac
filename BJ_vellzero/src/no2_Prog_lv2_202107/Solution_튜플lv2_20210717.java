package no2_Prog_lv2_202107;
import java.util.Arrays;
import java.util.HashSet;

class Solution_튜플lv2_20210717 {
	
	public static void main(String[] args) {
		
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		int [] test = solution(s);
		System.out.println(Arrays.toString(test));
		
	}
	
	public static int[] solution(String s) {
		int[] answer = {};
		
        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
       
        answer = new int[strs.length];
        
        HashSet<Integer> hs = new HashSet<Integer>();
        Arrays.sort(strs, (a,b)->(a.length()-b.length()));
        int i = 0;
        for(String str : strs){
            for(String st : str.split(",")){
                int a  = Integer.parseInt(st.trim());
                if(hs.contains(a))continue;
                hs.add(a);
                answer[i++] = a;
            }
        }
        return answer;
    }
}