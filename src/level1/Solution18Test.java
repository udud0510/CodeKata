package level1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution18Test {
	@Test
	public void 결과() {
		Solution18 solution = new Solution18();
		assertEquals(144, solution.solution(121));
		assertEquals(-1, solution.solution(3));
	}
}
