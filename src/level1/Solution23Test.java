package level1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution23Test {
	@Test
	public void 결과() {
		Solution23 solution = new Solution23();
		int[] answers = {1,2,3,4,5};
		int[] expect = {1};
		int[] answers2 = {1,3,2,4,2};
		int[] expect2 = {1,2,3};
		
		assertArrayEquals(expect, solution.solution(answers));
		assertArrayEquals(expect2, solution.solution(answers2));
		
	}
}
