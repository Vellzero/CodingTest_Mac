import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	static int N;//
	
	static ArrayList<Integer> num;
	static ArrayList<Character> op;
	
	static int max = Integer.MIN_VALUE;
	//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		String t = sc.next();
		
		
		num = new ArrayList<>();
		op = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			if(i%2==0) {
				num.add(t.charAt(i)-'0');
			} else {
				op.add(t.charAt(i));
			}
		}
		
		//System.out.println(num);
		//System.out.println(op);
		
		int start = num.get(0);
		
		dfs(0,start); // 
		System.out.println(max);
		
		
	}
	public static void dfs(int now, int sum) { //now는 op배열의 순서, sum은 여태의 합
		if(now >= op.size()) {  //배열의 순서가 기호의갯수를 넘어가면 if문으로 들어와서 max구하고 종
			max = Math.max(max, sum); //
			return;
		}
		
		int one = cal(now,sum, num.get(now+1));   //one에 합계와 num 다음값을 계한다.
		dfs(now+1,one);
		
		if(now+1<op.size()) { // 배열의 순서가 기호의 갯수를 아직 안넘으면 계속 진행한다.
			int two = cal(now+1, num.get(now+1), num.get(now+2)); //two에 여태합계와 num 다다음값을 계산한다.
			int result = cal(now,sum, two);
			dfs(now+2, result);
		}//
	}
	
	public static int cal(int op_idx, int a, int b) {
		switch(op.get(op_idx)) {
		case '+' :
			return a+b;
		case '-' :
			return a-b;
		case '*' :
			return a*b;
		}
		
		return 1;
	}
}

