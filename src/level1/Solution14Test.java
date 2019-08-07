package level1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution14Test {

	@Test
	public void 결과() {
		
		Solution14 solution = new Solution14();
		long[] answer = {2,4,6,8,10};
		long[] answer2 = {4,8,12};
		long[] answer3 = {-4,-8};
		assertArrayEquals(answer,solution.solution(2, 5));
		assertArrayEquals(answer2,solution.solution(4, 3));
		assertArrayEquals(answer3,solution.solution(-4, 2));
	}
}