package yujin.programmers.level2;

public class Solution2_11 {

	/*
	 * <멀쩡한 사각형>
	 *
	 * <입출력 예>
	 * W	H	result
	 * 8	12	80
	 */

	public long solution(long w, long h) {

		long max = Math.max(w, h);
		long min = Math.min(w, h);

		long gcd = getGCD(max, min);

		long answer = w * h - (w + h - gcd);

		return answer;

	}

	public static long getGCD(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
}
