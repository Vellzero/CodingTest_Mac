public class Solution {
	public static void main(String[] args) {
		int w = 5;
		int h = 9;
		long a = solution(w, h);
		System.out.println(a);
	}

	static long solution(int w, int h) {
		long answer = 0;
		long min = (long)h;
		long max = (long)w;
		if (w < h) {
			min = (long)w;
			max = (long)h;
		}

		long value = 1;
		while (value > 0) {
			value = max % min;
			max = min;
			min = value;
			System.out.println(max);
			System.out.println(value);
		}
		answer = (long)w * (long)h - ((long)w + (long)h - max);
		return answer;
	}
}