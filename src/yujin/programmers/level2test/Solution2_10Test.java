package yujin.programmers.level2test;

import static org.junit.Assert.*;

import org.junit.Test;

import yujin.programmers.level2.Solution2_10;

public class Solution2_10Test {

	@Test
	public void 기능개발() {
		Solution2_10 solution = new Solution2_10();

		int[] progresses = {93, 30, 55};
		int[] progresses2 = {95, 90, 99, 99, 80, 99};

		int[] speeds = {1, 30, 5};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};

		int[] result = {2, 1};
		int[] result2 = {1, 3, 2};

		assertEquals(result, solution.solution(progresses, speeds));
		assertEquals(result2, solution.solution(progresses2, speeds2));

	}
}