package level1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution16Test {
	@Test
	public void 결과() {
		Solution16 solution = new Solution16();
		int[] answer = { 5, 4, 3, 2, 1 };
		assertArrayEquals(answer, solution.solution(12345));

	}
}
