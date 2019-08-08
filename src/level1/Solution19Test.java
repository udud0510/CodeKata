package level1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution19Test {
	@Test
	public void 결과() {
		Solution19 solution = new Solution19();

		int[] arr = { 4, 3, 2, 1 };
		int[] answer = { 4, 3, 2 };

		int[] arr2 = { 10 };
		int[] answer2 = { -1 };

		assertArrayEquals(answer, solution.solution(arr));
		assertArrayEquals(answer2, solution.solution(arr2));
	}
}
