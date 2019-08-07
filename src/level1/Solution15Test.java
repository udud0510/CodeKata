package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Solution15Test {
	
	@Test
	public void 결과() {
		Solution15 solution = new Solution15();
		
		assertEquals(6, solution.solution(123));
		assertEquals(24, solution.solution(987));
	}
}
