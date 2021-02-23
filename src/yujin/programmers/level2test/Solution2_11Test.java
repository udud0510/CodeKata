package yujin.programmers.level2test;

import static org.junit.Assert.*;

import org.junit.Test;

import yujin.programmers.level2.Solution2_11;

public class Solution2_11Test {

	@Test
	public void 멀쩡한사각형() {
		Solution2_11 solution = new Solution2_11();

		assertEquals(80, solution.solution(8, 12));
	}
}