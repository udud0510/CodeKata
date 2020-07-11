package level1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution21Test {
	@Test
	public void 결과() {
		Solution21 solution = new Solution21();
		assertEquals(8, solution.solution(6));
		assertEquals(4, solution.solution(16));
		assertEquals(-1, solution.solution(626331));
	}
}
