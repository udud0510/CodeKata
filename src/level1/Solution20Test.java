package level1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution20Test {
	@Test
	public void 결과() {
		Solution20 solution = new Solution20();

		int[] answer = { 3, 12 };
		int[] answer2 = { 1, 10 };

		assertArrayEquals(answer, solution.solution(3, 12));
		assertArrayEquals(answer2, solution.solution(2, 5));
	}
}
