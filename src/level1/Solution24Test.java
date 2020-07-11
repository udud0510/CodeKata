package level1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution24Test {
	@Test
	public void 결과() {
		Solution24 solution = new Solution24();
		
		assertEquals("TUE", solution.solution(5,24));
	}
}